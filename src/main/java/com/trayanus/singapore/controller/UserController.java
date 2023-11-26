package com.trayanus.singapore.controller;

import com.trayanus.singapore.dto.UserDto;
import lombok.AllArgsConstructor;
import com.trayanus.singapore.model.User;
import com.trayanus.singapore.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("user")
@AllArgsConstructor
public class UserController {

    private UserService userService;
    @PostMapping("add")
    public ResponseEntity<User> addUser(@RequestBody UserDto userDto){
        User addedUser = userService.addUser(userDto);
        return new ResponseEntity<>(addedUser, HttpStatus.CREATED);
    }
}