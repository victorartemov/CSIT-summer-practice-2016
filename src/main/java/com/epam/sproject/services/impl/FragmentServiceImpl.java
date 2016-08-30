package com.epam.sproject.services.impl;

import com.epam.sproject.model.entity.Fragment;
import com.epam.sproject.model.entity.User;
import com.epam.sproject.model.repository.FragmentRepository;
import com.epam.sproject.model.repository.UserRepository;
import com.epam.sproject.services.FragmentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.io.IOException;
import java.util.Set;

@Service
public class FragmentServiceImpl implements FragmentService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private FragmentRepository fragmentRepository;
    
    @Override
    public Fragment getFragmentById(Long fragmentId) throws IOException {
	Fragment fragment = fragmentRepository.findOne(fragmentId);

        if (fragment == null) {
	    throw new IllegalArgumentException();
	} else {
	    return fragment;
	}
    }

    @Override
    public void saveFragment(Fragment newFragment) throws IOException {
        if (fragmentRepository.saveAndFlush(newFragment) == null) {
	    throw new IllegalArgumentException();
	}
    }

    @Override
    public void updateFragment(Fragment fragment) {
        fragmentRepository.saveAndFlush(fragment);
    }
    
    @Override
    public int addLike(Long fragmentId, Long userId) throws IOException {
	Fragment fragment = fragmentRepository.findOne(fragmentId);
	User user = userRepository.findOne(userId);
	
        Set<User> likes = fragment.getLikes();

	if (!likes.contains(user)) {
	    likes.add(user);
	}
	
	fragment.setLikes(likes);
	
        if (fragmentRepository.saveAndFlush(fragment) == null) {
	    throw new IllegalArgumentException();
	}
	
        return likes.size();
    }

    @Override
    public int removeLike(Long fragmentId, Long userId) throws IOException {
        Fragment fragment = fragmentRepository.findOne(fragmentId);
	User user = userRepository.findOne(userId);

	Set<User> likes = fragment.getLikes();

	if (likes.contains(user)) {
	    likes.remove(user);
	}

	if (fragmentRepository.saveAndFlush(fragment) == null) {
	    throw new IllegalArgumentException();
	}

	return likes.size();
    }
}
