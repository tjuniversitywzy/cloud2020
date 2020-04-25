package org.atguigu.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author : wzy
 * @Description :
 * @Date : Created in 2020/3/21
 * @Version :1.0
 */
@Configuration
public class MyRule {
    @Bean
    public IRule myrule(){
        return new RandomRule();//定义成随机
    }
}
