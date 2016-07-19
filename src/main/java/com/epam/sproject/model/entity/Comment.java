package model.entity;

/**
 * Created by Гога on 19.07.2016.
 */
public class Comment extends Item {
    private User author;
    private Fragment fragment;
    private String text;

    public Fragment getFragment() {
        return fragment;
    }

    public void setFragment(Fragment fragment) {
        this.fragment = fragment;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public User getAuthor() {

        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }
}
