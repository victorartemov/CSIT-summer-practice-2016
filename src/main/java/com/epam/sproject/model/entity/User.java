package com.epam.sproject.model.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Гога on 19.07.2016.
 */
@Entity
@Table(name = "user")
public class User extends Item {

    @Column(name = "login")
    private String login;

    @Column(name = "password")
    private String password;

    @Column(name = "role")
    private String role;

    @Column(name = "fullName")
    private String fullName;

    @Column(name = "rating")
    private Long rating;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "author")
    private Set<Fragment> fragments = new HashSet<Fragment>();

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "commentAuthor")
    private Set<Comment> comments = new HashSet<Comment>();

    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "likes")
    private Set<Fragment> likedFragments = new HashSet<Fragment>();
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

    public Set<Fragment> getFragments() {
        return fragments;
    }

    public void setFragments(Set<Fragment> fragments) {
        this.fragments = fragments;
    }

    public Set<Fragment> getLikedFragments() {
        return likedFragments;
    }

    public void setLikedFragments(Set<Fragment> likedFragments) {
        this.likedFragments = likedFragments;
    }

    public Set<Comment> getComments() {
        return comments;
    }

    public void setComments(Set<Comment> comments) {
        this.comments = comments;
    }


    public UserView toUserView(){
        UserView userView = new UserView(getId(), login, password, role, fullName, rating);
        return userView;
    }
    @Override
    public String toString() {
        return login;
    }
}
