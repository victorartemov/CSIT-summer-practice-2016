package com.epam.sproject.services.impl;

import com.epam.sproject.model.entity.User;
import com.epam.sproject.model.repository.UserRepository;
import com.epam.sproject.services.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    
    @Override
    public User getUserById(Long userId) throws IOException {
	User user = userRepository.findOne(userId);

	if (user == null) {
	    throw new IllegalArgumentException();
	} else {
	    return user;
	}
    }
    
    @Override
    public User getUserBylogin(String login) throws IOException {
        User user = userRepository.findByLogin(login);
	
	if (user == null) {
	    throw new IllegalArgumentException();
	} else {
	    return user;
	}
    }
}
