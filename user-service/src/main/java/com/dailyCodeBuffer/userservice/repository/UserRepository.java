package com.dailyCodeBuffer.userservice.repository;

import com.dailyCodeBuffer.userservice.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    User findByuserId(Long userId);
}
