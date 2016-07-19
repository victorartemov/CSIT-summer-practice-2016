package model.dao.impl;

import model.dao.UserDAO;
import model.entity.User;

import java.io.IOException;
import java.util.List;

/**
 * Created by Гога on 19.07.2016.
 */
public class UserDaoImpl implements UserDAO {

    public User getUserById(Long id) throws IOException {
        return null;
    }

    public User getUserByLogin(String login) throws IOException {
        return null;
    }

    public List<User> getAll() throws IOException {
        return null;
    }

    public User getById(Long id) throws IOException {
        return null;
    }

    public User update(User entity) throws IOException {
        return null;
    }

    public boolean delete(Long id) throws IOException {
        return false;
    }

    public boolean create(User entity) throws IOException {
        return false;
    }
}
