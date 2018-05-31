package com.amarpandey.sample.utils;

import org.springframework.http.HttpStatus;

public class ResponseStatus {

	private String message;
	private HttpStatus code;

	public ResponseStatus() {
		super();
	}

	public ResponseStatus(String message, HttpStatus code) {
		super();
		this.message = message;
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public HttpStatus getCode() {
		return code;
	}

	public void setCode(HttpStatus code) {
		this.code = code;
	}
}
