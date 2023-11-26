package com.trayanus.singapore.repository;

import com.trayanus.singapore.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
//    User findByUsername(String username);
}