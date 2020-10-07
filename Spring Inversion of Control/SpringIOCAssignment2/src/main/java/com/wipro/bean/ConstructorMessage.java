package com.wipro.bean;

public class ConstructorMessage {
	private String message;

	public ConstructorMessage(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
