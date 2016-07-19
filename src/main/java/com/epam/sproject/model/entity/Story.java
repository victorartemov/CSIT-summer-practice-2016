package model.entity;

/**
 * Created by Гога on 19.07.2016.
 */
public class Story extends Item {
    private Fragment rootFragment;
    private String title;

    public Fragment getRootFragment() {
        return rootFragment;
    }

    public void setRootFragment(Fragment rootFragment) {
        this.rootFragment = rootFragment;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
