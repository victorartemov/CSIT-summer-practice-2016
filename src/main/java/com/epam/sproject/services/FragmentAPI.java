package com.epam.sproject.services;

import com.epam.sproject.models.Fragment;

import java.util.Collection;

public interface FragmentAPI {

    Fragment getFragmentById(Long fragmentId);
    Fragment getRootFragmentFromBestStory();
    Collection<Fragment> getAllRootFragments();

    int increaseLikes(Long fragmentId);
    int decreaseLikes(Long fragmentId); /// it's cancel, not dislike

    void saveFragment(Fragment newFragment);
}
