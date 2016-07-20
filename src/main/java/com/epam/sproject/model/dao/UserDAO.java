package com.epam.sproject.model.dao;

import com.epam.sproject.model.entity.User;

import java.io.IOException;

/**
 * Created by Гога on 19.07.2016.
 */
public interface UserDAO extends DAO<User> {
    public User getUserByLogin() throws IOException;
}
