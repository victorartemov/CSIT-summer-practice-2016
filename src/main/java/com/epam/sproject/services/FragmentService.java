package com.epam.sproject.services;

import com.epam.sproject.model.entity.Fragment;

import java.io.IOException;

public interface FragmentService {
    Fragment getFragmentById(Long fragmentId) throws IOException ;

    void saveFragment(Fragment newFragment) throws IOException;

    int addLike(Long fragmentId, Long userId) throws IOException;
}
