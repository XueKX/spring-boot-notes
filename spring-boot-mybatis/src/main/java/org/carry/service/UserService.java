package org.carry.service;

import org.carry.entity.User;
import org.carry.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: CARRY
 * @CreateTime: 2019-06-25 14:48
 * @Description: ${Description}
 */
@Service
public class UserService {
    @Autowired
    UserMapper userMapper;

    public User sel(int id) {
        User sel = userMapper.sel(id);
        return sel;
    }
}
