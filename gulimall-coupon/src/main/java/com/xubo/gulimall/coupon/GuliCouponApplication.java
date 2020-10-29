package com.xubo.gulimall.coupon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient // 开启服务的注册发现功能
public class GuliCouponApplication {

    public static void main(String[] args) {
        SpringApplication.run(GuliCouponApplication.class, args);
    }

}
