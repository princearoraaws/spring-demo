package com.example.demo.componentscan;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ComponentScanDAO {
	
	private Logger LOGGER = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	JdbcConnectionComponentScan jdbcCon;

	public JdbcConnectionComponentScan getJdbcCon() {
		return jdbcCon;
	}

	public void setJdbcCon(JdbcConnectionComponentScan jdbcCon) {
		this.jdbcCon = jdbcCon;
	}
	
	

	
}
