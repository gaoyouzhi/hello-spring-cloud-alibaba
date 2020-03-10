package com.funtl.hello.spring.cloud.alibaba.nacos.consumer.feign.feign.fallback;

import com.funtl.hello.spring.cloud.alibaba.nacos.consumer.feign.feign.EchoService;
import org.springframework.stereotype.Component;

/**
 * @Description 描述：消费者服务熔断时的响应
 * @Author: youzhi.gao@ikang.com
 * @Date: 2020-03-10 15:52
 */
@Component
public class EchoServiceFallback implements EchoService {

    @Override
    public String echo(String message) {
        return "网络出现问题,echo fallback";
    }
}
