package com.epam.sproject.model.entity;

import java.util.Set;

/**
 * Created by Гога on 19.07.2016.
 */
public class Fragment extends Item {
    private User author;
    private Fragment parent;
    private String title;
    private String text;
    private Set<User> likes;
    private Set<Fragment> childFragments;
    private boolean extendable;

    public Set<Fragment> getChildFragments() {
        return childFragments;
    }

    public void setChildFragments(Set<Fragment> childFragments) {
        this.childFragments = childFragments;
    }

    public boolean isExtendable() {
        return extendable;
    }

    public void setExtendable(boolean extendable) {
        this.extendable = extendable;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public Fragment getParent() {
        return parent;
    }

    public void setParent(Fragment parent) {
        this.parent = parent;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Set<User> getLikes() {
        return likes;
    }

    public void setLikes(Set<User> likes) {
        this.likes = likes;
    }
}
