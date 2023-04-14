package com.fantasy.fantasystarter;

import com.fantasy.EnableStarterBeanRegister;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableStarterBeanRegister
public class FantasyStarterApplication {


    public static void main(String[] args) {
        SpringApplication.run(FantasyStarterApplication.class, args);
    }

}
