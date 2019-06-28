package org.carry;

import lombok.Data;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

/**
 * @Author: CARRY
 * @CreateTime: 2019-06-28 21:27
 * @Description: ${Description}
 */
@Data
public class Book implements Serializable {
    private Integer id;
    private String name;
    private String author;
}
