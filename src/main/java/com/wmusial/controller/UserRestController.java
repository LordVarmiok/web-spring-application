package com.wmusial.controller;

import com.wmusial.model.User;
import com.wmusial.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

public class UserRestController {

    @Autowired
    private UserRepository userRepository;

    @RequestMapping(value = "/api/users", method = RequestMethod.GET)
    public List<User> getUsers() {
        return userRepository.findAll();
    }
}
