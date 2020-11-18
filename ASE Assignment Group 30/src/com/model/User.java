package com.model;

import java.util.ArrayList;

import com.database.Main;

public class User {
	private String username;
	private String password;
	private String name;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public boolean login(String id,String pass) throws Exception {
		ArrayList<String> arr= Main.findUser(id);
		
		if (arr==null) {
			return false;
		}
		String p = arr.get(0);
		if (p.compareTo(pass)!=0) {
			return false;
		}
		else {
			username = id;
			password = pass;
			name = arr.get(1);
			return true;
		}
		
	}
	
	public boolean register(String id,String pass, String Name) throws Exception {
		boolean cr8 = Main.createTable();
		if (cr8) {
			ArrayList<String> arr= Main.findUser(id);
			if (arr.size()!=0) {
				return false;
			}else {
				boolean check = Main.addUser(id, pass, Name);
				username = id;
				password = pass;
				name = Name;
				return check;
			}
		}else return false;
		
	}
	
}
