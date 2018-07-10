package com.sunny.boot.example;

import com.sunny.boot.example.core.AppConfig;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@MapperScan("com.sunny.boot.example.**.mapper")
@Import({AppConfig.class})
public class BootExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootExampleApplication.class, args);
    }
}
