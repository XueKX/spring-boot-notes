package org.carry.entity;

import lombok.Data;

/**
 * @Author: CARRY
 * @CreateTime: 2019-06-25 14:42
 * @Description: 实体类  数据库字段的映射
 */
@Data
public class User {
    private Integer id;
    private String userName;
    private String passWord;
    private String user_sex;
}
