package com.example.demo.basic;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan
@Configuration
public class SpringDemoApplicationBasic {
	
	public static void main(String[] args) {
		
		//BinarySearchImpl binarySearch = new BinarySearchImpl(new QuickSortAlgo());
		ApplicationContext appCtx = new AnnotationConfigApplicationContext(SpringDemoApplicationBasic.class);
		BinarySearchImpl binarySearch = appCtx.getBean(BinarySearchImpl.class);
		BinarySearchImpl binarySearch1 = appCtx.getBean(BinarySearchImpl.class);
		System.out.println(binarySearch);
		System.out.println(binarySearch1);
		
		int index = binarySearch.binarySearch(new int [] {1,2,3}, 3);
		System.out.println(index);
	}

}
