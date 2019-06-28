package org.carry.service;

import org.carry.dao.UserDao;
import org.carry.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: CARRY
 * @CreateTime: 2019-06-26 11:13
 * @Description: ${Description}
 */
@Service
public class UserService {
    @Autowired
    UserDao userDao;

    public List<User> findAll() {
        return userDao.findAll();
    }

    public User findById(int id) {
        User user = userDao.findById(id);
        return user;
    }
}
