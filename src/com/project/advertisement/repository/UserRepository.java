package com.project.advertisement.repository;

import java.util.HashMap;
import java.util.Map;

import com.project.advertisement.model.User;

public class UserRepository {

	private Map<String, User> users = new HashMap<>();
	private static UserRepository obj;

	private UserRepository() {
	}

	public static UserRepository getInstance() {
		if (obj == null) {
			obj = new UserRepository();
		}
		return obj;
	}

	public User getUsers(String userId) {
		return users.get(userId);
	}

	public boolean containUsers(String userId) {
		return users.containsKey(userId);
	}
	public void addUser(User user) {
		this.users.put(user.getUserId(), user);
	}

}
