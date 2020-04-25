package org.atguigu.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @Author : wzy
 * @Description :
 * @Date : Created in 2020/3/18
 * @Version :1.0
 */
@Data
@AllArgsConstructor
//@NoArgsConstructor
public class Payment {
    public Payment(){
        System.out.println("空参构造器执行了");
    }
    private Long id;
    private String serial;
}
