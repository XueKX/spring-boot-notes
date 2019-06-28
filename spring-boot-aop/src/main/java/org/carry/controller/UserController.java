package org.carry.controller;

import org.carry.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: CARRY
 * @CreateTime: 2019-06-28 09:52
 * @Description: ${Description}
 */
@RestController
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/getUserById")
    public String getUserById(Integer id) {
        return userService.getUserById(id);
    }

    @GetMapping("/deleteUserById")
    public void deleteUserById(Integer id) {
        userService.deleteUserById(id);
    }
}
