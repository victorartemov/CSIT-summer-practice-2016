package com.epam.sproject.models;


/**
 * @author Vadim
 */
public class User {
    private int id;
    private String name;
    private String login;
    private String email;
    private String password;
    private String role = "User";

    public User() {
    }

    @Override
    public String toString() {
        return login;
    }

    public User(final String login, final String password) {
        this.login = login;
        this.password = password;
    }


    public String getLogin() {
        return login;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public int getId() {
        return id;
    }

    public String getRole() {
        return role;
    }

    public String getName() {
        return name;
    }
}