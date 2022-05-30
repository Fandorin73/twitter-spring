package com.home.twitterspring.repository;

import com.home.twitterspring.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Long> {
    User findByUsername(String username);
}
