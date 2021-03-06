package com.lyc.carjava;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class CarJavaApplication {

    public static void main(String[] args) {
        SpringApplication.run(CarJavaApplication.class, args);
        log.info("***** swagger: http://localhost:8080/car/swagger-ui.html *********");
    }

}
