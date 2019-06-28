package org.carry.controller;

import org.carry.entity.User;
import org.carry.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: CARRY
 * @CreateTime: 2019-06-25 14:44
 * @Description: ${Description}
 */
@Controller
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/getUser/{id}")
    @ResponseBody
    public String getUser(@PathVariable int id) {
        User user = userService.sel(id);
        return user.toString();
    }
//    @GetMapping("/getUser")
//    public String  getUser(@RequestParam(name = "id") int id) {
}
