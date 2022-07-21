package com.example.demo;

import com.example.demo.scope.PersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ScopeApplication {

    private static Logger LOGGER = LoggerFactory.getLogger(ScopeApplication.class);

    public static void main(String[] args) {

        ApplicationContext ac = SpringApplication.run(ScopeApplication.class, args);

        PersonDAO personDAO =  ac.getBean(PersonDAO.class);
        PersonDAO personDAO2 =  ac.getBean(PersonDAO.class);

        LOGGER.info("{}", personDAO);
        LOGGER.info("{}", personDAO.getJdbcConnection());


        LOGGER.info("{}", personDAO2);
        LOGGER.info("{}", personDAO2.getJdbcConnection());

    }

}
