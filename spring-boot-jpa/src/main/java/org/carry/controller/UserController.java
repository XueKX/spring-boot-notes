package org.carry.controller;

import org.carry.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: CARRY
 * @CreateTime: 2019-06-26 11:11
 * @Description: ${Description}
 */
@RestController
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping("/getAll")
    public String getAll() {
        return userService.findAll().toString();
    }

    @RequestMapping("/getUser/{id}")
    public String findById(@PathVariable int id) {
        return userService.findById(id).toString();
    }
}
