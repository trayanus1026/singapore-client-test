package com.trayanus.singapore.service;

import com.trayanus.singapore.dto.UserDto;
import com.trayanus.singapore.model.User;

public interface UserService {
    User addUser(UserDto userDto);
}