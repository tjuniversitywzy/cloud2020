package org.atguigu.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author : wzy
 * @Description :
 * @Date : Created in 2020/4/12
 * @Version :1.0
 */
@RestController
@RefreshScope
//在这里添加此注解，自动刷新
public class ConfigClientController {
    @Value("${hello}")
    private String configInfo;

    @GetMapping("/configInfo")
    public String getConfigInfo(){
        return configInfo;
    }
}
