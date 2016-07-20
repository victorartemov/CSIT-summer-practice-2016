package com.epam.sproject.services.impl;

import com.epam.sproject.model.dao.StoryDAO;
import com.epam.sproject.model.entity.Story;
import com.epam.sproject.services.StoryService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;
import java.util.Collection;
import java.util.List;

//@Service
public class StoryServiceImpl implements StoryService {
    //@Autowired
    StoryDAO storyDao;

    //@Transactional
    public Story getStoryById(Long storyId) throws IOException {
	Story story = storyDao.getById(storyId);

        if (story == null) {
	    throw new IllegalArgumentException();
	} else {
	    return story;
	}
    }

    //@Transactional
    public Story getBestStory() throws IOException {
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

	return bestStory;
    }

   // @Transactional
    public Collection<Story> getAllStories() throws IOException {
        Collection<Story> stories = storyDao.getAll();

	if (stories == null) {
	    throw new NullPointerException();
	} else {
	    return stories;
	}
    }
}
