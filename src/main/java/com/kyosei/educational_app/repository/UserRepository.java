package com.kyosei.educational_app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kyosei.educational_app.entity.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByEmail(String email);
}