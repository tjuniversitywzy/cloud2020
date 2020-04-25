package org.atguigu.springcloud.service;

import org.atguigu.springcloud.entities.Payment;

/**
 * @Author : wzy
 * @Description :
 * @Date : Created in 2020/3/18
 * @Version :1.0
 */
public interface PaymentService {
    public int create(Payment payment);

    public Payment getPaymentById(Long id);
}
