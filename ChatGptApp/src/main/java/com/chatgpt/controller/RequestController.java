package com.chatgpt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.chatgpt.model.Request;
import com.chatgpt.model.Response;

@RestController
public class RequestController {

	@Value("${URL}")
	private String URL;

	@Value("${model}")
	private String model;

	@Autowired
	RestTemplate restTemplate;

	@GetMapping("/chat")
	public String getResponse(@RequestParam("content") String content) {
		Request request = new Request(model, content);
		Response response = restTemplate.postForObject(URL, request, Response.class);

		return response.getChoices().get(0).getMessage().getContent();
	}
}
