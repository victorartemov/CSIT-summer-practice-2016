package model.dao;

import model.entity.User;

import java.io.IOException;

/**
 * Created by Гога on 19.07.2016.
 */
public interface UserDAO extends DAO<User> {
    public User getUserById(Long id) throws IOException;
    public User getUserByLogin(String login) throws IOException;
}
