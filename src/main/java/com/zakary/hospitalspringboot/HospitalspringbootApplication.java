package com.zakary.hospitalspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class HospitalspringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(HospitalspringbootApplication.class, args);
    }

    @RequestMapping("/hello")
    public String hello(){
        return "hello SpringBoot";
    }

}
