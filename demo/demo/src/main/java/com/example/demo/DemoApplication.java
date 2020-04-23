package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.slf4j.Slf4j;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 *
 * @author venkateswara
 */
@Slf4j
@SpringBootApplication(scanBasePackages = {"com.example.demo", "com.example.service", "com.example.modal"})
@EnableAutoConfiguration
@EnableSwagger2
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
    

}
