package com.project.advertisement.service;

import com.project.advertisement.model.User;
import com.project.advertisement.repository.UserRepository;

public class UserService {

	public boolean addUser(User user) {
		UserRepository userRepo = UserRepository.getInstance();
		if (userRepo.containUsers(user.getUserId())) {
			return false;
		} else {
			userRepo.addUser(user);
		}

		return true;
	}
}
