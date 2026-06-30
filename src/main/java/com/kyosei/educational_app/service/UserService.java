package com.kyosei.educational_app.service;

import com.kyosei.educational_app.entity.User;
import com.kyosei.educational_app.repository.UserRepository;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public UserService(UserRepository userRepository,
                       PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    public void register(String email, String password) {

        if (userRepository.findByEmail(email).isPresent()) {
            throw new IllegalArgumentException("Email already exists.");
        }
        
        User user = new User();
        user.setEmail(email);

        // パスワード暗号化
        user.setPassword(passwordEncoder.encode(password));

        // DB保存
        userRepository.save(user);
    }
}