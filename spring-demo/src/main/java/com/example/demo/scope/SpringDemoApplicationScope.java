package com.example.demo.scope;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
@ComponentScan
public class SpringDemoApplicationScope {

	private static Logger LOGGER = LoggerFactory.getLogger(SpringDemoApplicationScope.class);

	public static void main(String[] args) {

		// BinarySearchImpl binarySearch = new BinarySearchImpl(new QuickSortAlgo());

		try (
				AnnotationConfigApplicationContext appCtx = new AnnotationConfigApplicationContext(SpringDemoApplicationScope.class);
		){
		
		
		PersonDAO personDAO = appCtx.getBean(PersonDAO.class);
		PersonDAO personDAO2 = appCtx.getBean(PersonDAO.class);
		
		LOGGER.info("{}",personDAO);
		LOGGER.info("{}",personDAO.getJdbcCon());
		
		
		LOGGER.info("{}",personDAO2);
		LOGGER.info("{}",personDAO2.getJdbcCon());
		}
	}

}
