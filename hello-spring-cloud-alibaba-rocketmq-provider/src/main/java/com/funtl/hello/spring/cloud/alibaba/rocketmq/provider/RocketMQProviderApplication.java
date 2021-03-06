package com.funtl.hello.spring.cloud.alibaba.rocketmq.provider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;

/**
 * @Description 描述：RocketMQ服务提供者
 * @Author: youzhi.gao@ikang.com
 * @Date: 2020-03-10 15:56
 */
@SpringBootApplication
@EnableBinding({ Source.class})
public class RocketMQProviderApplication implements CommandLineRunner {

    @Autowired
    private MessageChannel output;

    public static void main(String[] args) {
        SpringApplication.run(RocketMQProviderApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        output.send(MessageBuilder.withPayload("Hello RocketMQ").build());
    }
}
