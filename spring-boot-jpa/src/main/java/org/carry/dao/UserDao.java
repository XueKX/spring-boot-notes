package org.carry.dao;

import org.carry.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 * @Author: CARRY
 * @CreateTime: 2019-06-26 11:06
 * @Description: ${Description}
 */
@Repository
public interface UserDao extends JpaRepository<User, Long> {
    //可以定义原生的SQL查询方法
    //@Query(value = "select * from jpa_user where id=1 ", nativeQuery = true)

    //命名规则匹配也可以自动生成SQL
    User findById(long id);
}
