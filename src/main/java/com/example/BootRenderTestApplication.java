package com.example;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@AutoConfigurationPackage
public class BootRenderTestApplication {

    public static void main(String[] args) {

        SpringApplication springApplication = new SpringApplication(BootRenderTestApplication.class);
        springApplication.setBannerMode(Banner.Mode.OFF);
        springApplication.run(args);

    }
}
