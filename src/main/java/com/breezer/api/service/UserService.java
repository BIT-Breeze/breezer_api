package com.breezer.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.breezer.api.repository.UserDao;

@Service
public class UserService {

	@Autowired
	private UserDao userDao;
	
	
	public boolean joinMessage() {
		return userDao.insert() == 1;
	}
}
