package com.epam.sproject.services;

import com.epam.sproject.model.entity.Story;

import java.io.IOException;
import java.util.Collection;

public interface StoryService {
    Story getStoryById(Long storyId);

    Story getBestStory();

    Collection<Story> getAllStories();
}
