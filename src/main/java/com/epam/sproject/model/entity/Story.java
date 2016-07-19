package com.epam.sproject.model.entity;

/**
 * Created by Гога on 19.07.2016.
 */
public class Story extends Item {
    private Fragment rootFragment;
    private String title;
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
}
