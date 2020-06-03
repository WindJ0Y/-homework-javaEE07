package com.windj0y.hw007.consumer_first;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient( value = "provider" )
public interface DateServiceFeignClientInterface {

    @GetMapping("/get")
    String consumer();
}