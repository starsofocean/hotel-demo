package com.starsofocean.hotel;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.starsofocean.hotel.mapper")
@SpringBootApplication
public class HotelDemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(HotelDemoApplication.class, args);
    }

}