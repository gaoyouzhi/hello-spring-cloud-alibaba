package com.funtl.hello.spring.cloud.alibaba.nacos.provider.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description 描述：Nacos提供者控制器
 * @Author: youzhi.gao@ikang.com
 * @Date: 2020-03-10 16:13
 */
@RestController
public class NacosProviderController {

    @Value("${server.port}")
    private String port;

    @Autowired
    private ConfigurableApplicationContext applicationContext;

    @GetMapping(value = "/echo/{message}")
    public String echo(@PathVariable String message) {
        return "Hello Nacos Discovery " + message + "I am from " + port;
    }
    @GetMapping("/hi")
    public String hi(){
        String name = applicationContext.getEnvironment().getProperty("user.name");
        return "name:" + name;
    }
}
