package org.carry.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * @Author: CARRY
 * @CreateTime: 2019-06-26 10:48
 * @Description: ${Description}
 */
@Entity      //该注解声明一个实体类 与数据库中的表对应
@Data
@Table(name = "jpa_user")
public class User {
    @Id     //表示该属性是一个主键
    @GeneratedValue(strategy = GenerationType.IDENTITY) //id生成策略自动增长
    private long id;

    @Column(name = "user_name", nullable = false)   //字段名称，字段非空
    private String name;
    @Column(nullable = false)
    private String age;
    @Column(nullable = false)
    private String sex;

}
