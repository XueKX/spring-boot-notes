package org.carry.mapper;

import org.carry.entity.User;
import org.springframework.stereotype.Repository;


/**
 * @Author: CARRY
 * @CreateTime: 2019-06-25 15:00
 * @Description: ${Description}
 */
@Repository
public interface UserMapper {
    User sel(int id);
}
