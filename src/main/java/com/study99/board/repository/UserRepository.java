package com.study99.board.repository;

import com.study99.board.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
    User findByUserId(String userID);
    boolean existsByUserId(String userId);
}
