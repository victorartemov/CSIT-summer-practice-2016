package com.epam.sproject.model.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Гога on 19.07.2016.
 */
@Entity
@Table(name = "fragment")
public class Fragment extends Item {

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "author_id")
    private User author;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "parent_fragment", referencedColumnName = "id")
    private Fragment parent;

    @Column(name = "title")
    private String title;

    @Column(name = "text")
    private String text;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "user_fragment",
            joinColumns = @JoinColumn(name = "user_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "fragment_id", referencedColumnName = "id")
    )
    private Set<User> likes;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "children_fragment", referencedColumnName = "id")
    private Set<Fragment> childFragments;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "fragment")
    private Set<Comment> comments = new HashSet<Comment>();

    @Column(name = "extendable")
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

    public Set<Comment> getComments() {
        return comments;
    }

    public void setComments(Set<Comment> comments) {
        this.comments = comments;
    }

    @Override
    public String toString() {
        return "Fragment{" +
                "author=" + author +
                ", parent=" + parent +
                ", title='" + title + '\'' +
                ", text='" + text + '\'' +
                ", likes=" + likes +
                ", childFragments=" + childFragments +
                ", comments=" + comments +
                ", extendable=" + extendable +
                '}';
    }
}
