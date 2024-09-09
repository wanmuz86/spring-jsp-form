package com.example.spring_jsp_form.model;

import java.util.ArrayList;
import java.util.List;

public class UserList {
	
	private List<User> users = new ArrayList<>();

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}
	
	public void addUser(User user) {
		users.add(user);
	}

}
