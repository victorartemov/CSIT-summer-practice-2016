package com.epam.sproject.model.repository;

import com.epam.sproject.model.entity.Fragment;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Виктор on 01.08.2016.
 */
public interface FragmentRepository extends JpaRepository<Fragment,Long> {
}
