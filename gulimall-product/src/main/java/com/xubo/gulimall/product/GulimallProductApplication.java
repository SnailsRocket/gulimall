package com.xubo.gulimall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 1.整合Mybatis-Plus
 *  1）、导入依赖
 *  2）、配置
 *      1.配置数据源
 *          1）、导入数据库驱动
 *          2）、在application.yml配置数据源相关信息
 *      2.配置Mybatis-Plus的相关信息
 *          1）、使用MapperScan扫描dao
 *          2）、告诉Mybatis-plus
 *      3.
 *
 */
@MapperScan("com.xubo.gulimall.product.dao")
@SpringBootApplication
public class GulimallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallProductApplication.class, args);
    }

}
