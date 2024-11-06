package com.example.demo.requests;

import lombok.Data;

@Data
public class CommentUpdateRequest {

	String text;

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public CommentUpdateRequest(String text) {
		super();
		this.text = text;
	}

	public CommentUpdateRequest() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
