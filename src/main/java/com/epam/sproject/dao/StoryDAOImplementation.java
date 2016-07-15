package com.epam.sproject.dao;

import com.epam.sproject.models.Story;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;


/**
 * @author Egor
 */
@Repository
public class StoryDAOImplementation implements StoryDAO {

    private ArrayList<Story> STORY_BASE = new ArrayList<>();

    static final String ADD_NEW_STORY_SQL_QUERY = "";

    public boolean addNewStory(long storyId, ArrayList<Long> fragmentIdList) {
		Story story = new Story(storyId, fragmentIdList);
		STORY_BASE.add(story);
		return true;
    }

    static final String GET_STORY_BY_ID_SQL_QUERY = "";

    public Story getStoryById(int storyId) {
		Story story = null;

			for (Story curStory : STORY_BASE) {
				if (curStory.getStoryId() == storyId) {
					story = curStory;
					break;
			}
		}

		return story;
    }
}
