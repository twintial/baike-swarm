package com.baike;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.filter.ratelimit.KeyResolver;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import reactor.core.publisher.Mono;

@SpringBootApplication
@EnableEurekaClient
public class BaikeGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(BaikeGatewayApplication.class, args);
    }

//    /**
//     * 创建用户唯一标识，使用IP作为唯一标识，根据IP进行限流
//     */
//    @Bean(name = "ipKeyResolver")
//    public KeyResolver userKeyResolver() {
//        return exchange -> {
//            // 唯一标识符ip
//            String ip = exchange.getRequest().getRemoteAddress().getHostString();
//            System.out.println(ip);
//            return Mono.just(ip);
//        };
//    }
}
