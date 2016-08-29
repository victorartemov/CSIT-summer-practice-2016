package com.epam.sproject.model.dao.impl;

import com.epam.sproject.model.dao.FragmentDAO;
import com.epam.sproject.model.entity.Fragment;
import com.epam.sproject.model.repository.FragmentRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.IOException;
import java.util.List;

/**
 * Created by Гога on 19.07.2016.
 */

//@Service - вот этот момент надо обсудить с Антоном или со мной
public class FragmentDaoImpl implements FragmentDAO {

    @Autowired
    private FragmentRepository fragmentRepository;

    @Override
    public List<Fragment> getAll() throws IOException {
        return fragmentRepository.findAll();
    }

    @Override
    public Fragment getById(Long id) throws IOException {
        return fragmentRepository.findOne(id);
    }

    @Override
    public boolean update(Fragment entity) throws IOException {
        Fragment newFragment = fragmentRepository.saveAndFlush(entity);
        return newFragment == null ? false : true;
    }

    @Override
    public boolean delete(Fragment entity) throws IOException {
        Fragment catchingFragment = fragmentRepository.findOne(entity.getId());
        if(catchingFragment == null){
            return false;
        }
        else {
            fragmentRepository.delete(entity);
            return true;
        }
    }

    @Override
    public boolean create(Fragment entity) throws IOException {
        Fragment newFragment = fragmentRepository.saveAndFlush(entity);
        return newFragment == null ? false : true;
    }
}
