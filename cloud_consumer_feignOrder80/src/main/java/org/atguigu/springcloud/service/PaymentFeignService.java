package org.atguigu.springcloud.service;

import org.atguigu.springcloud.entities.CommonResult;
import org.atguigu.springcloud.entities.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @Author : wzy
 * @Description :
 * @Date : Created in 2020/3/21
 * @Version :1.0
 */
@Component
@FeignClient(value = "cloud-payment-service")
public interface PaymentFeignService {
    @GetMapping("/payment/get/{id}")
    CommonResult<Payment> getPaymentById(@PathVariable("id") Long id);
}
