package org.carry;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: CARRY
 * @CreateTime: 2019-07-02 15:43
 * @Description: ${Description}
 */
@RestController
public class HelloController {
    //测试security默认配置用
    @GetMapping("/hi")
    public String hi() {
        return "hello CARRY";
    }

    @GetMapping("/admin/hello")
    public String admin() {
        return "hello admin!";
    }

    @GetMapping("/admin/db/hello")
    public String admin2() {
        return "/admin/db/hello";
    }

    @GetMapping("/user/hello")
    public String user() {
        return "hello user!";
    }

    @GetMapping("/db/hello")
    public String dba() {
        return "hello dba!";
    }

//    @Autowired
//    MethodService methodService;
//
//    @GetMapping("/hello")
//    public String hello() {
//        String user = methodService.user();
//        return user;
//    }
//
//    @GetMapping("/hello2")
//    public String hello2() {
//        String admin = methodService.admin();
//        return admin;
//    }
//
//    @GetMapping("/hello3")
//    public String hello3() {
//        String dba = methodService.dba();
//        return dba;
//    }
}

