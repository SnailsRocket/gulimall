package com.xubo.gulimall.coupon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 1、如何使用nacos作为配置中心统一管理配置
 *
 *  1）引入依赖
 *  2）创建一个bootstrap.properties文件 ，配置application.name 和 addr
 *  3）需要给配置中心默认添加一个叫当前应用名.properties(gulimall-coupon.properties).默认规则应用名.properties
 *  4）给3中创建的文件 添加任何配置
 *  5）动态获取配置
 *  6）在获取配置文件的Controller 中添加
 *      @RefreshScope(动态刷新配置) 注解
 *      @Value 获取配置值
 *  如果nacos和配置文件中都配置了相同的项，那么优先使用配置中心中的配置
 *
 * 2.细节
 *  1）命名空间
 *  2）配置集
 *  3）配置ID
 *  4）配置分组
 *  
 */
@SpringBootApplication
@EnableDiscoveryClient // 开启服务的注册发现功能
public class GuliCouponApplication {

    public static void main(String[] args) {
        SpringApplication.run(GuliCouponApplication.class, args);
    }

}
