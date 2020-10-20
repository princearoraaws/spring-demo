package com.example.demo.properties;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

@PropertySource("classpath:app.properties")
@ComponentScan
public class SpringDemoApplicationProperties {
	
	private static Logger LOGGER = LoggerFactory.getLogger(SpringDemoApplicationProperties.class);
	public static void main(String[] args) {
		
		
		AnnotationConfigApplicationContext appCtx = new AnnotationConfigApplicationContext(SpringDemoApplicationProperties.class);
		
		LOGGER.info("Beans Loaded --> {}",(Object)appCtx.getBeanDefinitionNames());
		CustomerService customerService = appCtx.getBean(CustomerService.class);
		LOGGER.info("{}",customerService);
		LOGGER.info("{}",customerService.returnServiceURL());
		appCtx.close();
	}

}
