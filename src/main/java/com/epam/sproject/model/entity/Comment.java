package com.epam.sproject.model.entity;

import javax.persistence.*;

/**
 * Created by Гога on 19.07.2016.
 */
@Entity
@Table(name = "comment")
public class Comment extends Item {

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "author_id")
    private User commentAuthor;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "fragment_id")
    private Fragment fragment;

    @Column(name = "text")
    private String text;

    public Fragment getFragment() {
        return fragment;
    }

    public void setFragment(Fragment fragment) {
        this.fragment = fragment;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public User getAuthor() {

        return commentAuthor;
    }

    public void setAuthor(User author) {
        this.commentAuthor = author;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "commentAuthor=" + commentAuthor +
                ", fragment=" + fragment +
                ", text='" + text + '\'' +
                '}';
    }
}
