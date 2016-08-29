package com.epam.sproject.model.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Гога on 19.07.2016.
 */

public class UserView {

    private Long id;

    private String login;

    private String password;

    private String role;

    private String fullName;

    private Long rating;



    public UserView() {
    }

    public UserView(Long id, String login, String password, String role, String fullName, Long rating) {
        this.id = id;
        this.login = login;
        this.password = password;
        this.role = role;
        this.fullName = fullName;
        this.rating = rating;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Long getRating() {
        return rating;
    }

    public void setRating(Long rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return login;
    }
}
