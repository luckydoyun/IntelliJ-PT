package com.example.practice01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class Practice01Application {

    public static void main(String[] args) {
        SpringApplication.run(Practice01Application.class, args);
    }

}
