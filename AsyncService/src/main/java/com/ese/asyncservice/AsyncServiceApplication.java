package com.ese.asyncservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class AsyncServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(AsyncServiceApplication.class, args);
    }

}
