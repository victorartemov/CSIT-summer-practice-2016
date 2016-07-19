package com.epam.sproject.model.entity;

/**
 * Created by Гога on 19.07.2016.
 */
public abstract class Item {
    private Long id;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
