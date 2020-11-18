package com.controller;

import com.model.User;

public class UserAction {
	private User user;
	
	public User getUser() {
		return user;
	}
	
	public void setUser(User user) {
		this.user = user;
	}
	
	public String login() throws Exception{
		boolean log = user.login(user.getUsername(), user.getPassword());
		if (log) return "success";
		else return "error";
	}
	
	public String Redirect() {
		return "success";
	}
	
	public String register() throws Exception{
		boolean reg = user.register(user.getUsername(), user.getPassword(), user.getName());
		if (reg) return "success";
		else return "error";
	}

}