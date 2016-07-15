package com.epam.sproject.dao;

import com.epam.sproject.models.Story;

import java.util.ArrayList;

/**
 * @author Egor
 */
public interface StoryDAO {

    boolean addNewStory(long storyId, ArrayList<Long> fragmentIdList);
    Story getStoryById(int storyId);
}
