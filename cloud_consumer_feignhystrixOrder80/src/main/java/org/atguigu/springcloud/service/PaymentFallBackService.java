package org.atguigu.springcloud.service;

import org.springframework.stereotype.Service;

/**
 * @Author : wzy
 * @Description :
 * @Date : Created in 2020/3/24
 * @Version :1.0
 */
@Service
public class PaymentFallBackService implements PaymentHystrixService {
    @Override
    public String paymentInfo_OK(Integer id) {
        return "这是通过实现类的OK兜底方法";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "这是通过实现类的TimeOut兜底方法";
    }
}
