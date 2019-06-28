package org.carry.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: CARRY
 * @CreateTime: 2019-05-22 09:54
 * @Description: ${Description}
 * @BelongsProject: spring-boot-notes
 * @BelongsPackage: com.carry.controller
 */
@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello() {
        return "hello spring boot!";
    }
}
