package com.atguigu.gmall;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@EnableDubbo
@EnableHystrix
@SpringBootApplication
@MapperScan("com.atguigu.gmall.dao")
public class BootProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootProviderApplication.class, args);
    }

}
