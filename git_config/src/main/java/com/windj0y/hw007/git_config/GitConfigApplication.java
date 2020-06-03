package com.windj0y.hw007.git_config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableDiscoveryClient
@EnableConfigServer
@SpringBootApplication
@RestController
public class GitConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(GitConfigApplication.class, args);
    }

    @RequestMapping("/test")
    public String test(){
        return "val + "  ;
    }

}
