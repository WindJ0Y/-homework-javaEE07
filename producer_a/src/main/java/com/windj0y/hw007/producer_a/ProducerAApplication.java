package com.windj0y.hw007.producer_a;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.core.env.Environment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@EnableEurekaClient
@SpringBootApplication
@EnableDiscoveryClient
@RefreshScope
public class ProducerAApplication {

    @Value("${addition}")
    private int val;

    public static void main(String[] args) {
        SpringApplication.run(ProducerAApplication.class, args);
    }

    @RequestMapping("/get")
    public String getNumberSquare(){
        return "PA: " + val;
    }

}
