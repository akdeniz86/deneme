package com.example.demo.requests;

import lombok.Data;

@Data
public class LikeCreateRequest {
	
	Long id;
	Long userId;
	Long postId;
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
	public LikeCreateRequest(Long id, Long userId, Long postId) {
		super();
		this.id = id;
		this.userId = userId;
		this.postId = postId;
	}
	public LikeCreateRequest() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
