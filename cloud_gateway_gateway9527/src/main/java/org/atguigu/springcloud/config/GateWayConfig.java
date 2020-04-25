package org.atguigu.springcloud.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author : wzy
 * @Description :
 * @Date : Created in 2020/4/10
 * @Version :1.0
 */
@Configuration
public class GateWayConfig {
    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder routeLocatorBuilder){
        RouteLocatorBuilder.Builder routes = routeLocatorBuilder.routes();
        //这句话意思就是访问9527的/guonei，会转发道百度的这个地址
        routes.route("path_route_atguigu",  r-> r.path("/guonei").uri("http://news.baidu.com/")).build();
        return routes.build();
    }
}
