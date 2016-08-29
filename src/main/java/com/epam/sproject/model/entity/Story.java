package com.epam.sproject.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * Created by Гога on 19.07.2016.
 */
@Entity
@Table(name = "story")
public class Story extends Item {

	@OneToOne
	@JoinColumn(name="root_fragment_id")
    private Fragment rootFragment;

    @Column(name = "title")
    private String title;

    @Column(name = "rating")
    private Long rating;

    public Long getRating() {
        return rating;
    }

    public void setRating(Long rating) {
        this.rating = rating;
    }

    public Fragment getRootFragment() {
        return rootFragment;
    }

    public void setRootFragment(Fragment rootFragment) {
        this.rootFragment = rootFragment;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Story{" +
                "rootFragment=" + rootFragment +
                ", title='" + title + '\'' +
                ", rating=" + rating +
                '}';
    }
}
