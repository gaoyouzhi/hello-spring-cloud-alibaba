package com.funtl.hello.spring.cloud.alibaba.nacos.consumer.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Description 描述：实现熔断的消费者启动类
 * @Author: youzhi.gao@ikang.com
 * @Date: 2020-03-10 15:53
 */
@EnableDiscoveryClient
@EnableFeignClients
@SpringBootApplication
public class NacosConsumerFeignApplication {
    public static void main(String[] args) {
        SpringApplication.run(NacosConsumerFeignApplication.class, args);
    }
}
