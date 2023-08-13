package com.chatgpt.model;

import java.util.ArrayList;
import java.util.List;

public class Request {

	private String model = "gpt-3.5-turbo";
	private List<Massage> messages;

	public Request() {
		super();
	}

	public Request(String model, String messages) {
		super();
		this.model = model;
		this.messages = new ArrayList<>();
		this.messages.add(new Massage("user", messages));
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	
	public List<Massage> getMessages() {
		return messages;
	}

	public void setMessages(List<Massage> messages) {
		this.messages = messages;
	}

	@Override
	public String toString() {
		return "Request [model=" + model + ", messages=" + messages + "]";
	}

}
