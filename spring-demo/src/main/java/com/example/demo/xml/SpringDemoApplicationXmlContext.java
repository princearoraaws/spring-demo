package com.example.demo.xml;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDemoApplicationXmlContext {
	
	private static Logger LOGGER = LoggerFactory.getLogger(SpringDemoApplicationXmlContext.class);
	public static void main(String[] args) {
		
		
		ClassPathXmlApplicationContext appCtx = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		LOGGER.info("Beans Loaded --> {}",(Object)appCtx.getBeanDefinitionNames());
		XMLPersonDAO xmlPersonDAO = appCtx.getBean(XMLPersonDAO.class);
		LOGGER.info("{}",xmlPersonDAO);
		LOGGER.info("{}",xmlPersonDAO.getXmlJdbcCon());
		appCtx.close();
	}

}
