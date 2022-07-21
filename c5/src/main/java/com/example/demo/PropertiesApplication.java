package com.example.demo;

import com.example.demo.basic.BinarySearchImpl;
import com.example.demo.basic.SomeExternalService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:app.properties")
public class PropertiesApplication {

	public static void main(String[] args) {

//		BinarySearchImpl binarySearch = new BinarySearchImpl(new QuickSortAlg());
//		int result = binarySearch.binarySearch(new int[]{1,2,3,4},3);

//		System.out.println(result);

		final ApplicationContext ac = SpringApplication.run(PropertiesApplication.class, args);

		SomeExternalService someExternalService=  ac.getBean(SomeExternalService.class);

		System.out.println(someExternalService.returnServiceUrl());

	}

}
