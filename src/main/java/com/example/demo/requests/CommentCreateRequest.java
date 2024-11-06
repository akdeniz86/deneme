package com.example.demo.requests;

import lombok.Data;

@Data
public class CommentCreateRequest {
	
	Long id;
	Long userId;
	Long postId;
	String text;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public Long getPostId() {
		return postId;
	}
	public void setPostId(Long postId) {
		this.postId = postId;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public CommentCreateRequest(Long id, Long userId, Long postId, String text) {
		super();
		this.id = id;
		this.userId = userId;
		this.postId = postId;
		this.text = text;
	}
	public CommentCreateRequest() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
