package com.example.demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="user")
@Data
@Getter
@Setter
public class User {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	String userName;
	String password;
	int avatar;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
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
	public int getAvatar() {
		return avatar;
	}
	public void setAvatar(int avatar) {
		this.avatar = avatar;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public User(Long id, String userName, String password, int avatar) {
		super();
		this.id = id;
		this.userName = userName;
		this.password = password;
		this.avatar = avatar;
	}

	
	
	
}
