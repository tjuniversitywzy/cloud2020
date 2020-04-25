package org.atguigu.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.atguigu.springcloud.entities.CommonResult;
import org.atguigu.springcloud.entities.Payment;
import org.atguigu.springcloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Author : wzy
 * @Description :
 * @Date : Created in 2020/3/18
 * @Version :1.0
 */
@RestController
@Slf4j
public class PaymentController {
    @Autowired
    private PaymentService paymentService;

    @PostMapping("/payment/create")
    public CommonResult create(@RequestBody Payment payment){
        int result = paymentService.create(payment);
        log.debug("***插入结果"+result);
        if (result > 0){
            return new CommonResult(200,"插入数据库成功8002",result);
        }else {
            return new CommonResult(444,"插入失败8002");
        }
    }

    @GetMapping("/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id){
        Payment payment = paymentService.getPaymentById(id);
        log.info("***查询结果"+payment);
        log.info("***8002****");
        if (payment != null){
            return new CommonResult(200,"查询成功8002",payment);
        }else {
            return new CommonResult(444,"没有对应记录8002");
        }
    }
}
