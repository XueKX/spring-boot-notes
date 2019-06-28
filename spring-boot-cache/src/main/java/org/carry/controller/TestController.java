package org.carry.controller;

import org.carry.CacheTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Date;

/**
 * @Author: CARRY
 * @CreateTime: 2019-06-28 17:08
 * @Description: ${Description}
 */
@Controller
public class TestController {
    @Autowired
    CacheTest cacheTest;

    @GetMapping(value = "/")
    public String hello() {
        for (int i = 0; i < 5; i++) {
            System.out.println(new Date() + " " + cacheTest.cacheFunction(i));
        }
        return "/hello";
    }
}
