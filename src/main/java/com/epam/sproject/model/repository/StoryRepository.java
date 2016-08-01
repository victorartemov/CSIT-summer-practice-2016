package com.epam.sproject.model.repository;

import com.epam.sproject.model.entity.Story;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Виктор on 01.08.2016.
 */
public interface StoryRepository extends JpaRepository<Story,Long> {
}