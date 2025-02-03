package org.example.servicelog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class ServiceLogApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceLogApplication.class, args);
    }

}
