package com.epam.sproject.models;

/**
 * @author Egor
 */
public class Fragment {
    
    private long fragmentId;
    private long parentId;
    private String data;
    private int authorId;
    private int countLikes;

    public Fragment(long fragmentId, long parentId, String data, int authorId, int countLikes) {
        this.fragmentId = fragmentId;
        this.parentId = parentId;
        this.data = data;
        this.authorId = authorId;
        this.countLikes = countLikes;
    }

    public long getFragmentId() {
	return this.fragmentId;
    }

    public void setFragmentId(long fragmentId) {
	this.fragmentId = fragmentId;
    }

    public long getParentId() {
        return this.parentId;
    }

    public void setParentId(long parentId) {
        this.parentId = parentId;
    }

    public String getData() {
        return this.data;
    }

    public void setData(String data) {
	this.data = data;
    }

    public int getAuthorId() {
	return this.authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }

    public int getCountLikes() {
	return this.countLikes;
    }

    public void setCountLikes(int countLikes) {
	this.countLikes = countLikes;
    }

    public String toString() {
	return "{FRAGMENT_ID = " + this.fragmentId + ", DATA = " + this.data + "}";
    }
}
