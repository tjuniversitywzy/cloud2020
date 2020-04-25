package org.atguigu.springcloud.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author : wzy
 * @Description :
 * @Date : Created in 2020/4/10
 * @Version :1.0
 */
@RestController
public class hello {
    @RequestMapping("/hello")
    public String helloA(){
        return "hello";
    }
}
