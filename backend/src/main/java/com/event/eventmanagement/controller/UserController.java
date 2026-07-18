package com.event.eventmanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.event.eventmanagement.entity.User;
import com.event.eventmanagement.service.UserService;

import java.util.List;


@RestController
@RequestMapping("/user")
@CrossOrigin
public class UserController {

    @Autowired
    private UserService userService;

    // User Registration
    @PostMapping("/register")
    public User register(@RequestBody User user) {
        return userService.registerUser(user);
    }

    // User Login
    @PostMapping("/login")
    public User login(@RequestBody User user) {
        return userService.loginUser(user.getEmail(), user.getPassword());
    }
    @GetMapping("/all")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }
}
