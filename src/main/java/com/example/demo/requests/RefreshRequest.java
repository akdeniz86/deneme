package com.example.demo.requests;

import lombok.Data;

@Data
public class RefreshRequest {

	Long userId;
	String refreshToken;
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getRefreshToken() {
		return refreshToken;
	}
	public void setRefreshToken(String refreshToken) {
		this.refreshToken = refreshToken;
	}
	public RefreshRequest(Long userId, String refreshToken) {
		super();
		this.userId = userId;
		this.refreshToken = refreshToken;
	}
	public RefreshRequest() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
