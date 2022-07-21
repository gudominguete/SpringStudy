package com.example.demo.cdi;


import com.example.demo.scope.PersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SomeCDIApplication {

    private static Logger LOGGER = LoggerFactory.getLogger(SomeCDIApplication.class);

    public static void main(String[] args) {

        ApplicationContext ac = SpringApplication.run(SomeCDIApplication.class, args);

        SomeCDIBusiness business = ac.getBean(SomeCDIBusiness.class);

        LOGGER.info("{}", business);

    }

}
