package com.example.photoeditorbe.controllers;


import com.example.photoeditorbe.models.User;
import com.example.photoeditorbe.repositories.PictureRepository;
import com.example.photoeditorbe.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class UsersController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/users")
    public Iterable<User> findAllUsers() {
        return userRepository.findAll();
    }

    @GetMapping("/users/{userId}")
    public User getUserById(@PathVariable Long userId) {
        return userRepository.findById(userId).get();
    }


}
