package com.example.demo.requests;

import lombok.Data;

@Data
public class UserRequest {
	
	String userName;
	String password;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public UserRequest(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}
	public UserRequest() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
