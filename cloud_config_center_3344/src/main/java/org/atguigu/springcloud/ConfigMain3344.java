package org.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @Author : wzy
 * @Description :
 * @Date : Created in 2020/4/11
 * @Version :1.0
 */
@SpringBootApplication
@EnableConfigServer
//开启注册中心配置
public class ConfigMain3344 {
    public static void main(String[] args) {
        SpringApplication.run(ConfigMain3344.class,args);
    }
}
