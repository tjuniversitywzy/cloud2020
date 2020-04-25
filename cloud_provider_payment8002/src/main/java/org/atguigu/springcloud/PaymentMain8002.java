package org.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author : wzy
 * @Description :
 * @Date : Created in 2020/3/18
 * @Version :1.0
 */
@EnableEurekaClient
@SpringBootApplication
public class PaymentMain8002 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain8002.class,args);
    }
}
