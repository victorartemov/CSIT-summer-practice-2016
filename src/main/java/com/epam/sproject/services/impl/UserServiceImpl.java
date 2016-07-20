package com.epam.sproject.services.impl;

import com.epam.sproject.model.entity.User;
import com.epam.sproject.model.dao.UserDAO;
import com.epam.sproject.services.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;

//@Service
public class UserServiceImpl implements UserService {
   // @Autowired
    UserDAO userDAO;

   // @Transactional
    public User getUserById(Long userId) throws IOException {
	User user = userDAO.getById(userId);

	if (user == null) {
	    throw new IllegalArgumentException();
	} else {
	    return user;
	}
    }
    
  //  @Transactional
    public User getUserBylogin(String login) throws IOException {
        User user = userDAO.getUserByLogin(login);
	
	if (user == null) {
	    throw new IllegalArgumentException();
	} else {
	    return user;
	}
    }
}
