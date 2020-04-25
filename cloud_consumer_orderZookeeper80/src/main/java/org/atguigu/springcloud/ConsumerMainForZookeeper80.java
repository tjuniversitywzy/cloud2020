package org.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author : wzy
 * @Description :
 * @Date : Created in 2020/3/20
 * @Version :1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ConsumerMainForZookeeper80 {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerMainForZookeeper80.class, args);
    }
}
