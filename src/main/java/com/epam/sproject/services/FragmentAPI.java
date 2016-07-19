package com.epam.sproject.services;

import com.epam.sproject.models.Fragment;

import java.util.Collection;

public interface FragmentAPI {

    Fragment getFragmentById(long fragmentId);
    Fragment getRootFragmentFromBestStory();
    Collection<Fragment> getAllRootFragments();

    int increaseLikes(long fragmentId);
    int decreaseLikes(long fragmentId); /// it's cancel, not dislike

    void saveFragment(Fragment newFragment);
}
