package com.house;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HouseApplication {

    public static void main(String[] args) {
        //这不是一个Netty问题。您需要在应用程序中确保首先初始化Elasticsearch客户端，或者将系统属性
        // 设置es.set.netty.runtime.available.processors为false以便客户端在客户端初始化时不尝试设置
        // 处理器数量。
        System.setProperty("es.set.netty.runtime.available.processors", "false");
        SpringApplication.run(HouseApplication.class, args);
    }
}
