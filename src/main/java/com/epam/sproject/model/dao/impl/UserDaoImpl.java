package com.epam.sproject.model.dao.impl;

import com.epam.sproject.model.dao.UserDAO;
import com.epam.sproject.model.entity.User;

import java.io.IOException;
import java.util.List;

/**
 * Created by Гога on 19.07.2016.
 */
public class UserDaoImpl implements UserDAO {

    @Override
    public User getUserByLogin() throws IOException {
        return null;
    }

    @Override
    public List<User> getAll() throws IOException {
        return null;
    }

    @Override
    public User getById(Long id) throws IOException {
        return null;
    }

    @Override
    public User update(User entity) throws IOException {
        return null;
    }

    @Override
    public boolean delete(User entity) throws IOException {
        return false;
    }

    @Override
    public boolean create(User entity) throws IOException {
        return false;
    }
}
