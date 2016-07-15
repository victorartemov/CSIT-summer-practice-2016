package com.epam.sproject.dao;

import com.epam.sproject.models.Fragment;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;

/**
 * @author Egor
 */
@Repository
public class FragmentDAOImplementation implements FragmentDAO {

    private ArrayList<Fragment> FRAGMENT_BASE = new ArrayList<>();
    
    static final String ADD_NEW_FRAGMENT_SQL_QUERY = "";
    
    public boolean addNewFragment(long fragmentId, long parentId, String data, int authorId, int countLikes) {
        Fragment fragment = new Fragment(fragmentId, parentId, data, authorId, countLikes);
        FRAGMENT_BASE.add(fragment);
        return true;
    }

    static final String GET_FRAGMENT_BY_ID_SQL_QUERY = "";
    
    public Fragment getFragmentById(long fragmentId) {
        Fragment fragment = null;

        for (Fragment curFragment : FRAGMENT_BASE) {
	        if (curFragment.getFragmentId() == fragmentId) {
		        fragment = curFragment;
		        break;
	    }
	}

	return fragment;
    }
}
