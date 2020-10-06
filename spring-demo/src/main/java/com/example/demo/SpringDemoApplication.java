package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDemoApplication {

	public static void main(String[] args) {
		
		/* 
		 //What are the beans ?
			// 1. perform component scan ==> Searching for classes with @Component
			// 2. Create the instances
		    // 3. Autowire the dependencies via constructor injection. 
				  Other type is setter injection.
				  All mandatory dependencies should be autowired using constructor
		// What are the dependencies of the bean ?
		 * 
		 * Autowiring by type --> @Primary. @Primary has higher priority
		 * Autowiring by instance variable name --> Name of the variable resolves the conflict
		 * Autowiring by qulaifier
		// Where to search for beans ?
		 * 
		 * 
		 
		 */
		
		
		//BinarySearchImpl binarySearch = new BinarySearchImpl(new QuickSortAlgorithm());
		//int index = binarySearch.binarySearch(new int[] {12,2,3},3);
		
		
		
		//Spring Application Context manages all the beans
		ApplicationContext appCtx = SpringApplication.run(SpringDemoApplication.class, args);
		
		/*Bean Scopes:
		 * 1. Singleton (Default)
		 * If we request the same bean multiple times, 
		 * the container will return the same instance of the bean, everytime a getBean is done.
		 * These are singleton beans. All beans managed by container are by default singleton.
		 * 
		 * 2. prototype: Get a new instance of the bean, everytime the bean is requested
		 * 
		 * 3. request : One bean per HTTP request
		 * 
		 * 4. session : One bean per user session
		 * 
		 * We can define scope of bean with annotation @Scope
		 * 
		 */
		BinarySearchImpl binarySearch = appCtx.getBean(BinarySearchImpl.class);
		BinarySearchImpl binarySearch2 = appCtx.getBean(BinarySearchImpl.class);
		System.out.println(binarySearch);
		System.out.println(binarySearch2);
		
		int index = binarySearch.binarySearch(new int[] {12,2,3},3);
		System.out.println(index);
	
	}

}
