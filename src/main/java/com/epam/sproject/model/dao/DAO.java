package com.epam.sproject.model.dao;

import com.epam.sproject.model.entity.Item;

import java.io.IOException;
import java.util.List;

/**
 * Created by Гога on 19.07.2016.
 */
public interface DAO<T extends Item> {
    public List<T> getAll() throws IOException;

    public T getById(Long id) throws IOException;

    public boolean update(T entity) throws IOException;

    public boolean delete(T entity) throws IOException;

    public boolean create(T entity) throws IOException;
}
