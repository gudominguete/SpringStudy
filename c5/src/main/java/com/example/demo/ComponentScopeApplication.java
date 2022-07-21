package com.example.demo;

import com.example.componentScan.ComponentDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example.componentScan")
public class ComponentScopeApplication {

    private static Logger LOGGER = LoggerFactory.getLogger(ComponentScopeApplication.class);

    public static void main(String[] args) {

        ApplicationContext ac = SpringApplication.run(ComponentScopeApplication.class, args);

        ComponentDAO componentDAO =  ac.getBean(ComponentDAO.class);

        LOGGER.info("{}", componentDAO);

    }

}
