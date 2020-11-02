package com.example.demo.basic;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

// determines how to load and configure an ApplicationContext for integration tests
@ContextConfiguration(locations = "/applicationContext.xml")

//The SpringRunner provides support for loading a Spring ApplicationContext
//and having beans @Autowired into your test instance
@RunWith(SpringRunner.class)
public class BinarySearchImplTest {

	Logger LOGGER = LoggerFactory.getLogger(this.getClass());
	// Get this bean from the context
	@Autowired
	BinarySearchImpl binarySearchImpl;
	
	@Test
	public void test() {
		// call method on the bean
		int result = binarySearchImpl.binarySearch(new int [] {}, 5);
		LOGGER.info("Result is : {}........",(new Integer(result)).toString());
	}

}
