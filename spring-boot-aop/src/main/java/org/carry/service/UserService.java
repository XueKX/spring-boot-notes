package org.carry.service;

import org.springframework.stereotype.Service;

/**
 * @Author: CARRY
 * @CreateTime: 2019-06-28 09:52
 * @Description: ${Description}
 */
@Service
public class UserService {

    public String getUserById(Integer id) {
        System.out.println("get...");
        return "user";
    }

    public void deleteUserById(Integer id) {
        int i = 1 / 0;
        System.out.println("delete...");
    }
}
