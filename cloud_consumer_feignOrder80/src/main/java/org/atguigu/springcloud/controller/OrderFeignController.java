package org.atguigu.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.atguigu.springcloud.entities.CommonResult;
import org.atguigu.springcloud.entities.Payment;
import org.atguigu.springcloud.service.PaymentFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author : wzy
 * @Description :
 * @Date : Created in 2020/3/21
 * @Version :1.0
 */
@RestController
@Slf4j
public class OrderFeignController {
    @Autowired
    private PaymentFeignService paymentFeignService;

    @GetMapping("/consumer/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable Long id){
        return paymentFeignService.getPaymentById(id);
    }
}
