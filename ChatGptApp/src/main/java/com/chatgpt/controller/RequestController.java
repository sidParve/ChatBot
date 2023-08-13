package com.chatgpt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.mvc.method.annotation.StreamingResponseBody;

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
	public StreamingResponseBody  getResponse(@RequestParam("content") String content) {
		Request request = new Request(model, content);
		Response response = restTemplate.postForObject(URL, request, Response.class);
		
		 return outputStream -> {
	            // Write your API response data to the output stream
	            // You can read data from your API and write it to the output stream in chunks
	            // Example: Read data from an API response and write it to the output stream
	            outputStream.write(response.getChoices().get(0).getMessage().getContent().getBytes());
	        };
	}
}
