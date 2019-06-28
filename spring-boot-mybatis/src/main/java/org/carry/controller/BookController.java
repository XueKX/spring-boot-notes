package org.carry.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: CARRY
 * @CreateTime: 2019-05-22 16:08
 * @Description: ${Description}
 * @BelongsProject: spring-boot-notes
 * @BelongsPackage: org.carry.controller
 */
@RestController
public class BookController {
    @Autowired
    Book book;

    @GetMapping("/book")
    public String book() {
        return book.toString();
    }
}
