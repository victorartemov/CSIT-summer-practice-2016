package com.epam.sproject.model.dao.impl;

import com.epam.sproject.model.dao.UserDAO;
import com.epam.sproject.model.entity.User;
import com.epam.sproject.model.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.IOException;
import java.util.List;

/**
 * Created by Гога on 19.07.2016.
 */

//@Service - вот этот момент надо обсудить с Антоном или со мной
public class UserDaoImpl implements UserDAO {
    @Autowired
    private UserRepository userRepository;

    @Override
    public User getUserByLogin(String login) throws IOException {
        return userRepository.findByLogin(login);
    }

    @Override
    public List<User> getAll() throws IOException {
        return userRepository.findAll();
    }

    @Override
    public User getById(Long id) throws IOException {
        return userRepository.getOne(id);
    }

    @Override
    public boolean update(User entity) throws IOException {
        User newUser = userRepository.saveAndFlush(entity);
        return newUser != null ? false : true;
    }

    @Override
    public boolean delete(User entity) throws IOException {
        User catchingFragment = userRepository.findOne(entity.getId());
        if(catchingFragment == null){
            return false;
        }
        else {
            userRepository.delete(entity);
            return true;
        }
    }

    @Override
    public boolean create(User entity) throws IOException {
        User newUser = userRepository.saveAndFlush(entity);
        return newUser == null ? false : true;
    }
}
