package com.event.eventmanagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.event.eventmanagement.entity.User;
import com.event.eventmanagement.repository.UserRepository;
import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    // Register user
   

    // User login
    public User loginUser(String email, String password) {
        User user = userRepository.findByEmail(email);
        if (user != null && user.getPassword().equals(password)) {
            return user;
        }
        return null;
    }
    // Register user
    
    public User registerUser(User user) {

        if(user.getEmail().equals("sofiashree16@gmail.com")) {
            user.setRole("ADMIN");
        } else {
            user.setRole("USER");
        }

        return userRepository.save(user);
    }
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
