package com.projects.fruitStore.controller;

import com.projects.fruitStore.models.UserModel;
import com.projects.fruitStore.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping()
    public ArrayList<UserModel> getUsers() {
        return userService.getUsers();
    }

    @PostMapping()
    public String saveUser(@RequestBody UserModel user) {
        return this.userService.saveUser(user);
    }
}
