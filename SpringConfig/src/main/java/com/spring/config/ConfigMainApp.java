package com.spring.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @ClassName: ConfigMainApp
 * @Author: ycq
 * @Description:
 * @Date: 2022/3/31 20:42
 * @Company:
 **/

@SpringBootApplication
@EnableConfigServer
public class ConfigMainApp {

    public static void main(String[] args) {
        SpringApplication.run(ConfigMainApp.class, args);
    }

}
