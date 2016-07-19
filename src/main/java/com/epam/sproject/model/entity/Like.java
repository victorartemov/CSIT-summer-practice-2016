package model.entity;

/**
 * Created by Гога on 19.07.2016.
 */
public class Like {
    private User authorId;
    private Fragment fragmentId;

    public Like(User authorId, Fragment fragmentId) {
        this.authorId = authorId;
        this.fragmentId = fragmentId;
    }
}
