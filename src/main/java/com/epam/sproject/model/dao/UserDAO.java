package model.dao;

import model.entity.User;

/**
 * Created by Гога on 19.07.2016.
 */
public interface UserDAO extends DAO<User> {
    public User getUserByLogin();
}
