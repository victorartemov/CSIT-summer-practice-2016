package com.epam.sproject.model.dao.impl;

import com.epam.sproject.model.dao.FragmentDAO;
import com.epam.sproject.model.entity.Fragment;

import java.io.IOException;
import java.util.List;

/**
 * Created by Гога on 19.07.2016.
 */
public class FragmentDaoImpl implements FragmentDAO {

    @Override
    public List<Fragment> getAll() throws IOException {
        return null;
    }

    @Override
    public Fragment getById(Long id) throws IOException {
        return null;
    }

    @Override
    public boolean update(Fragment entity) throws IOException {
        return false;
    }

    @Override
    public boolean delete(Fragment entity) throws IOException {
        return false;
    }

    @Override
    public boolean create(Fragment entity) throws IOException {
        return false;
    }
}
