package com.example.feign.feign.config;

import com.example.feign.feign.interceptor.DemoFeignInterceptorT;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DemoFeignConfig {

    @Bean
    public DemoFeignInterceptorT feignInterceptor() {
        return DemoFeignInterceptorT.of();
    }
}
