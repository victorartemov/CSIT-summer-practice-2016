package com.epam.sproject.services;

import com.epam.sproject.model.entity.User;

import java.io.IOException;

public interface UserService {
    User getUserById(Long userId) throws IOException;
    
    User getUserBylogin(String login) throws IOException;
}
