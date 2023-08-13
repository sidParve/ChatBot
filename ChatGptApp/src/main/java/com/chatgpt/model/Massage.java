package com.chatgpt.model;

import org.springframework.stereotype.Component;

@Component
public class Massage {
	private String role;
	private String content;

	public Massage() {
		super();
	}

	public Massage(String role, String content) {
		super();
		this.role = role;
		this.content = content;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String rOLE) {
		role = rOLE;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "messages [ROLE=" + role + ", Content=" + content + "]";
	}

}
