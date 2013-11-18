package com.sian.example;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;

import com.sian.example.bo.UserBo;
import com.sian.example.dto.User;

@Path(value="/users")
public class UserExample {

	@Autowired
	private UserBo userBo;

	@GET
	@Path(value="/{user}")
	@Produces({ MediaType.APPLICATION_XML})
	public User sayHtmlHello(@PathParam(value="user")String username) {
		User user = userBo.getUser(username);
		return user;
	}

}
