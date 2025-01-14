package com.example.demo.requests;

import lombok.Data;

@Data
public class PostUpdateRequest {

	String title;
	String text;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public PostUpdateRequest(String title, String text) {
		super();
		this.title = title;
		this.text = text;
	}
	
	
}
