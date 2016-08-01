package com.epam.sproject.model.repository;

import com.epam.sproject.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Виктор on 01.08.2016.
 */
public interface UserRepository extends JpaRepository<User, Long> {
    User findByLogin(String login);
}
