package com.example.demo.scope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component

public class PersonDAO {
	
	@Autowired
	JdbcConnection jdbcCon;

	public JdbcConnection getJdbcCon() {
		return jdbcCon;
	}

	public void setJdbcCon(JdbcConnection jdbcCon) {
		this.jdbcCon = jdbcCon;
	}
	

	
}
