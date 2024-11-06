package com.example.demo.responses;

import com.example.demo.entities.Comment;

import lombok.Data;

@Data
public class CommentResponse {
	
	Long id;
	Long userId;
	String userName;
	String text;
	public CommentResponse(Long id, Long userId, String userName, String text) {
		super();
		this.id = id;
		this.userId = userId;
		this.userName = userName;
		this.text = text;
	}
	
	

	public CommentResponse(Comment entity) {
		this.id = entity.getId();
		this.userId = entity.getUser().getId();
		this.userName = entity.getUser().getUserName();
		this.text = entity.getText();
	}
}
