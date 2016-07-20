package com.epam.sproject.services.impl;

import com.epam.sproject.model.dao.FragmentDAO;
import com.epam.sproject.model.dao.UserDAO;
import com.epam.sproject.model.entity.Fragment;
import com.epam.sproject.model.entity.User;
import com.epam.sproject.services.FragmentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;
import java.util.Set;

//@Service
public class FragmentServiceImpl implements FragmentService {
   // @Autowired
    private FragmentDAO fragmentDao;
   // @Autowired
   private UserDAO userDao;
    
    @Transactional
    public Fragment getFragmentById(Long fragmentId) throws IOException {
	Fragment fragment = fragmentDao.getById(fragmentId);

        if (fragment == null) {
	    throw new IllegalArgumentException();
	} else {
	    return fragment;
	}
    }

    @Transactional
    public void saveFragment(Fragment newFragment) throws IOException {
        if (!fragmentDao.create(newFragment)) {
	    throw new IllegalArgumentException();
	}
    }

    @Transactional
    public int addLike(Long fragmentId, Long userId) throws IOException {
	Fragment fragment = fragmentDao.getById(fragmentId);
	User user = userDao.getById(userId);
	
        Set<User> likes = fragment.getLikes();
	likes.add(user);
	fragment.setLikes(likes);
	
        if (!fragmentDao.update(fragment)) {
	    throw new IllegalArgumentException();
	}
	
        return likes.size();
    }
}
