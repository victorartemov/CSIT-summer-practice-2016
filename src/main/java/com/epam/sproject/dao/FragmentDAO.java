package com.epam.sproject.dao;

import com.epam.sproject.models.Fragment;


/**
 * @author Egor
 */
public interface FragmentDAO {

    boolean addNewFragment(long fragmentId, long parentId, String data, int authorId, int countLikes);
    Fragment getFragmentById(long fragmentId);
}
