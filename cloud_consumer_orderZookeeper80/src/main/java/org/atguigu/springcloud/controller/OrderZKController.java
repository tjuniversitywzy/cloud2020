package org.atguigu.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Author : wzy
 * @Description :
 * @Date : Created in 2020/3/20
 * @Version :1.0
 */
@RestController
@Slf4j
public class OrderZKController {
    public static final String url = "http://cloud-provider-paymentForZookeeper";

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/consumer/payment/zk")
    public String paymentInfo(){
        System.out.println("消费者一端");
        String result = restTemplate.getForObject(url+"/payment/zk",String.class);
        return result;
    }

}
