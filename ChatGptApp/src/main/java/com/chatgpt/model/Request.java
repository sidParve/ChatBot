package com.chatgpt.model;

import java.util.ArrayList;
import java.util.List;


public class Request {

	private Double temperature = 1.0;
	private String model = "gpt-3.5-turbo";
	private Double top_p = 1.0;
	private Integer n = 1;
	private boolean stream = false;
	private Integer presence_penalty = 1;
	private Integer frequency_penalty = 1;
	private List<Massage> messages;

	public Request() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Request(String model, String messages) {
		super();
		this.model = model;
		this.messages = new ArrayList<>();
		this.messages.add(new Massage("user",messages));
	}

	public Request(Double temperature, String model, Double top_p, Integer n, boolean stream, Integer presence_penalty,
			Integer frequency_penalty, List<Massage> massages) {
		super();
		this.temperature = temperature;
		this.model = model;
		this.top_p = top_p;
		this.n = n;
		this.stream = stream;
		this.presence_penalty = presence_penalty;
		this.frequency_penalty = frequency_penalty;
		this.messages = massages;
	}

	public Double getTemperature() {
		return temperature;
	}

	public void setTemperature(Double temperature) {
		this.temperature = temperature;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Double getTop_p() {
		return top_p;
	}

	public void setTop_p(Double top_p) {
		this.top_p = top_p;
	}

	public Integer getN() {
		return n;
	}

	public void setN(Integer n) {
		this.n = n;
	}

	public boolean isStream() {
		return stream;
	}

	public void setStream(boolean stream) {
		this.stream = stream;
	}

	public Integer getPresence_penalty() {
		return presence_penalty;
	}

	public void setPresence_penalty(Integer presence_penalty) {
		this.presence_penalty = presence_penalty;
	}

	public Integer getFrequency_penalty() {
		return frequency_penalty;
	}

	public void setFrequency_penalty(Integer frequency_penalty) {
		this.frequency_penalty = frequency_penalty;
	}

	public List<Massage> getMessages() {
		return messages;
	}

	public void setMessages(List<Massage> messages) {
		this.messages = messages;
	}

	@Override
	public String toString() {
		return "Request [temperature=" + temperature + ", model=" + model + ", top_p=" + top_p + ", n=" + n
				+ ", stream=" + stream + ", presence_penalty=" + presence_penalty + ", frequency_penalty="
				+ frequency_penalty + ", messages=" + messages + "]";
	}

}
