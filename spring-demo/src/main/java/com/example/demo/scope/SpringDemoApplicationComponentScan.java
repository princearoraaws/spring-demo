package com.example.demo.scope;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import com.example.demo.componentscan.ComponentScanDAO;

@Component
@ComponentScan("com.example.demo.componentscan")
public class SpringDemoApplicationComponentScan {

	private static Logger LOGGER = LoggerFactory.getLogger(SpringDemoApplicationComponentScan.class);

	public static void main(String[] args) {


		ApplicationContext appCtx = new AnnotationConfigApplicationContext(SpringDemoApplicationComponentScan.class);
		ComponentScanDAO componentScanDAO = appCtx.getBean(ComponentScanDAO.class);
		
		LOGGER.info("{}",componentScanDAO);

	}

}
