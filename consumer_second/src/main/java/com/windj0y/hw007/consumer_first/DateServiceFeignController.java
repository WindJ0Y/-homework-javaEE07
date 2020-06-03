package com.windj0y.hw007.consumer_first;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/consumer")
public class DateServiceFeignController {

    @Resource
    DateServiceFeignClientInterface dateServiceFeignClientInterface;

    @GetMapping("/api/v1/demo/get")
    public String get() {
        return "fetcher_fegin ... " + dateServiceFeignClientInterface.consumer( );
    }
}