package model.dao;

import java.io.IOException;

/**
 * Created by Гога on 19.07.2016.
 */
public interface StoryDAO {
    public StoryDAO getStoryById(Long id) throws IOException;
}
