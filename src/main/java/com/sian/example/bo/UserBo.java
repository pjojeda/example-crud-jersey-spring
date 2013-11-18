package com.sian.example.bo;

import com.sian.example.dto.User;

public class UserBo {

	public User getUser(String username){
		User user = new User();
		user.setId(1);
		user.setName(username);
		user.setCity("Resistencia");
		return user;
	}
	
}
