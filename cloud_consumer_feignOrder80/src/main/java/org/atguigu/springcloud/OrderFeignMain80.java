package org.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Author : wzy
 * @Description :
 * @Date : Created in 2020/3/21
 * @Version :1.0
 */
@SpringBootApplication
@EnableFeignClients//使用feign激活
public class OrderFeignMain80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderFeignMain80.class, args);
    }
}
