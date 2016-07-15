package com.epam.sproject.dao;


import com.epam.sproject.models.User;


/**
 * @author Vadim
 */
public interface UserDAO {

    public boolean add(final User user);

    public void edit(final User user);

    public User getUserById(final int id);

    /**
     * Method to check login/pass and get User information
     * @param login
     * @param password
     * @return User object if login and password correct, else return null
     */
    public User getUserByLoginPass(final String login, final String password);

}
