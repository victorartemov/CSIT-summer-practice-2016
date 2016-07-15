package com.epam.sproject.models;

import java.util.ArrayList;

/**
 * @author Egor
 */
public class Story {

    private long storyId;
    private ArrayList<Long> fragmentIdList;

    public Story(long storyId, ArrayList<Long> fragmentIdList) {
        this.storyId = storyId;
        this.fragmentIdList = fragmentIdList;
    }

    public long getStoryId() {
	return this.storyId;
    }

    public void setStoryId(long storyId) {
	this.storyId = storyId;
    }

    public ArrayList<Long> getFragmentIdList() {
        return this.fragmentIdList;
    }

    public void setFragmentIdList(ArrayList<Long> fragmentIdList) {
        this.fragmentIdList = fragmentIdList;
    }

    public String toString() {
        //TODO: join ArrayList to String 
	return "{STORY_ID = " + this.storyId + "}"; 
    }
}
