package com.example.demo;

import com.example.demo.basic.BinarySearchImpl;
import com.example.demo.xml.XMLPersonDAO;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Configurable
@ComponentScan
public class XmlApplication {

    public static void main(String[] args){
        try(ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml")){

            XMLPersonDAO xmlPersonDAO =  applicationContext.getBean(XMLPersonDAO.class);
        }
    }
}
