package com.example.api.controller;

import com.example.model.User;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }


    @GetMapping("/users")
    public List<User> listUser(){
        return  userService.listUser();

    }

    @GetMapping("/users/{id}")
    public User getUser(@PathVariable Integer id){
        Optional<User> user = userService.getUser(id);

        return (User) user.orElse(null);

    }

}
