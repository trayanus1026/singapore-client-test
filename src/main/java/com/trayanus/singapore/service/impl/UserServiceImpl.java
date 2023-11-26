package com.trayanus.singapore.service.impl;

import com.trayanus.singapore.dto.UserDto;
import com.trayanus.singapore.model.User;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import com.trayanus.singapore.repository.UserRepository;
import com.trayanus.singapore.service.UserService;

@Service
@AllArgsConstructor
@Slf4j
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;
//    private final PasswordEncoder passwordEncoder;

    public BCryptPasswordEncoder passwordEncoder;
    @Override
    public User addUser(UserDto userDto) {
        User user = new User();
        user.setUsername(userDto.getUsername());
        user.setPassword(passwordEncoder.encode(userDto.getPassword()));
        return userRepository.save(user);
    }
}