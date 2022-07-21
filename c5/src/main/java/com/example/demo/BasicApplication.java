package com.example.demo;

import com.example.demo.basic.BinarySearchImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class BasicApplication {

	public static void main(String[] args) {

//		BinarySearchImpl binarySearch = new BinarySearchImpl(new QuickSortAlg());
//		int result = binarySearch.binarySearch(new int[]{1,2,3,4},3);

//		System.out.println(result);

		final ApplicationContext ac = SpringApplication.run(BasicApplication.class, args);

		BinarySearchImpl binarySearch1 =  ac.getBean(BinarySearchImpl.class);
		int result1 = binarySearch1.binarySearch(new int[]{1,2,3,4},3);

		System.out.println(binarySearch1);

		BinarySearchImpl binarySearch =  ac.getBean(BinarySearchImpl.class);
		int result = binarySearch.binarySearch(new int[]{1,2,3,4},3);
		System.out.println(binarySearch);

	}

}
