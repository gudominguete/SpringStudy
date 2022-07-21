package com.example.demo;

import com.example.demo.basic.BinarySearchImpl;
import com.example.demo.xml.XMLPersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XmlApplication {

    private static Logger LOGGER = LoggerFactory.getLogger(XmlApplication.class);
    public static void main(String[] args){
        try(ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml")){

            LOGGER.info("{}", (Object) applicationContext.getBeanDefinitionNames());

            XMLPersonDAO xmlPersonDAO =  applicationContext.getBean(XMLPersonDAO.class);


        }
    }
}
