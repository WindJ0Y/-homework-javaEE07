package com.windj0y.hw007.consumer_first;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@RestController
@EnableDiscoveryClient
@SpringBootApplication
public class ConsumerFirstApplication {

    @Autowired
    private RestTemplate restTemplate;

    @Value("${spring.application.name}")
    private String appName;

    public static void main(String[] args) {
        SpringApplication.run(ConsumerFirstApplication.class, args);
    }

    @LoadBalanced
    @Bean
    public RestTemplate rest(){
        return new RestTemplate();
    }


    @RequestMapping("/api/v1/demo/get")
    public String getNumberSquare(){
        String rtn;
        rtn = restTemplate.getForObject("http://provider/get?num=", String.class );
        return "fetcher:" + appName + " , info:" + rtn;
    }

}
