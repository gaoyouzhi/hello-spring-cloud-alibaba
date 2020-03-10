package com.funtl.hello.spring.cloud.alibaba.nacos.consumer.feign.feign;

import com.funtl.hello.spring.cloud.alibaba.nacos.consumer.feign.feign.fallback.EchoServiceFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @Description 描述：熔断接口
 * @Author: youzhi.gao@ikang.com
 * @Date: 2020-03-10 15:53
 */
@FeignClient(value = "nacos-provider", fallback = EchoServiceFallback.class)
public interface EchoService {

    @GetMapping(value = "/echo/{message}")
    String echo(@PathVariable("message") String message);
}
