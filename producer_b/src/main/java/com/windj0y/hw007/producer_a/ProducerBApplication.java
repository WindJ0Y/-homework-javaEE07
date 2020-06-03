package com.windj0y.hw007.producer_a;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableEurekaClient
@SpringBootApplication
@EnableDiscoveryClient
@RefreshScope
public class ProducerBApplication {

    @Value("${addition}")
    private int val;

    public static void main(String[] args) {
        SpringApplication.run(ProducerBApplication.class, args);
    }

    @RequestMapping("/get")
    public String getNumberSquare(){
        return "PB: " + val;
    }

}