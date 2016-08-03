package com.epam.sproject.services.impl;

import com.epam.sproject.model.dao.StoryDAO;
import com.epam.sproject.model.entity.Fragment;
import com.epam.sproject.model.entity.Story;
import com.epam.sproject.model.entity.User;
import com.epam.sproject.services.StoryService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class StoryServiceImpl implements StoryService {
    //@Autowired
     StoryDAO storyDao;



    //@Transactional
    public Story getStoryById(Long storyId){
		Story story = null;
		try {
			story = storyDao.getById(storyId);
		} catch (IOException e) {
			e.printStackTrace();
		}

		if (story == null) {
	    throw new IllegalArgumentException();
	} else {
	    return story;
	}
    }

    //@Transactional
    public Story getBestStory()  {
		User user = new User();
		user.setId(1L);
		user.setFullName("Straud");


		Set<User> likes = new HashSet<>();
		likes.add(user);

		Fragment rootFragmentStory = new Fragment();
		rootFragmentStory.setId(1L);
		rootFragmentStory.setTitle("Bartimaeus");
		rootFragmentStory.setAuthor(user);
		rootFragmentStory.setLikes(likes);
		rootFragmentStory.setText("The temperature of the room dropped fast. Ice formed on the curtains and" +
				"crusted thickly around the lights in the ceiling. The glowing filaments in each bulb" +
				"shrank and dimmed, while the candles that sprang from every available surface like" +
				"a colony of toadstools had their wicks snuffed out. The darkened room filled with a" +
				"yellow, choking cloud of brimstone, in which indistinct black shadows writhed and" +
				"roiled. From far away came the sound of many voices screaming. Pressure was suddenly" +
				"applied to the door that led to the landing. It bulged inward, the timbers" +
				"groaning. Footsteps from invisible feet came pattering across the floorboards and" +
				"invisible mouths whispered wicked things from behind the bed and under the desk.");
		rootFragmentStory.setChildFragments(new HashSet<>());

		Story famousStory = new Story();
		famousStory.setTitle("The Amulet of Samarkand");
		famousStory.setRating(10000L);
		famousStory.setId(1L);
		famousStory.setRootFragment(rootFragmentStory);


		/*
		List<Story> stories = storyDao.getAll();

	Story bestStory = null;
	
        if (stories == null) {
	    throw new NullPointerException();
	} else {
	    if (!stories.isEmpty()) {
		bestStory = stories.get(0);

		for (Story curStory : stories) {
		    if (curStory.getRating() > bestStory.getRating()) {
			bestStory = curStory;
		    }
		}
	    }
	}
*/
	return famousStory;
    }

   // @Transactional
    public Collection<Story> getAllStories()  {
		Collection<Story> stories = null;
		try {
			stories = storyDao.getAll();
		} catch (IOException e) {
			e.printStackTrace();
		}

		if (stories == null) {
	    throw new NullPointerException();
	} else {
	    return stories;
	}
    }
}
