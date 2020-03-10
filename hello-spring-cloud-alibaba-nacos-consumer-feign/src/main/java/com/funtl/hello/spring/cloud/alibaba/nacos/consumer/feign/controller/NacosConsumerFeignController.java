package com.funtl.hello.spring.cloud.alibaba.nacos.consumer.feign.controller;

import com.funtl.hello.spring.cloud.alibaba.nacos.consumer.feign.feign.EchoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description 描述：Nacos实现熔断的控制器
 * @Author: youzhi.gao@ikang.com
 * @Date: 2020-03-10 15:52
 */
@RestController
public class NacosConsumerFeignController {

    @Autowired
    private EchoService echoService;

    @GetMapping(value = "/echo")
    public String echo() {
        return echoService.echo("Hi Feign");
    }

}
