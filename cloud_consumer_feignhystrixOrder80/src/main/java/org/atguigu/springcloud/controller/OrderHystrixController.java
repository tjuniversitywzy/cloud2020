package org.atguigu.springcloud.controller;

import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.netflix.ribbon.proxy.annotation.Hystrix;
import lombok.extern.slf4j.Slf4j;
import org.atguigu.springcloud.service.PaymentHystrixService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author : wzy
 * @Description :
 * @Date : Created in 2020/3/23
 * @Version :1.0
 */
@RestController
@Slf4j
@DefaultProperties(defaultFallback = "globalFallbackMethod")
public class OrderHystrixController {
    @Autowired
    private PaymentHystrixService paymentHystrixService;

    public String globalFallbackMethod(){
        return "80：全局的异常兜底";
    }


    @GetMapping("/consumer/payment/hystrix/ok/{id}")
    public String paymentInfo_OK(@PathVariable("id") Integer id){
        return paymentHystrixService.paymentInfo_OK(id);
    }

    @GetMapping("/consumer/payment/hystrix/timeout/{id}")
    @HystrixCommand(fallbackMethod = "paymentTimeOutFallbackMethod",commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds",value = "2000")
    })
    public String paymentInfo_TimeOut(@PathVariable("id") Integer id){
        String s;
        try {
            s = paymentHystrixService.paymentInfo_TimeOut(id);
        }finally {
            System.out.println("80执行超时，准备容错");
        }
        return s;
    }

    public String paymentTimeOutFallbackMethod(){
        return "我是消费者80端，对方支付系统繁忙，请10秒钟后再试或者自己运行出错，自己检查";
    }

}
