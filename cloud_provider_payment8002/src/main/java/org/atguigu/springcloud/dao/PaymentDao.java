package org.atguigu.springcloud.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.atguigu.springcloud.entities.Payment;
import org.springframework.stereotype.Repository;

/**
 * @Author : wzy
 * @Description :
 * @Date : Created in 2020/3/18
 * @Version :1.0
 */
@Mapper
public interface PaymentDao {
    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
