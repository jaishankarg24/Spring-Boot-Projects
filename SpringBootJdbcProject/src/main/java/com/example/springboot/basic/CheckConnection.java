package com.example.springboot.basic;

import javax.sql.DataSource;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class CheckConnection implements CommandLineRunner {

	/**
	 * This would be used by the SpringContainer, where the logic written inside
	 * run() would be executed only once.
	 */

	@Autowired
	private DataSource dataSource;

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public void run(String... args) throws Exception {
		System.out.println("DataSource Implemented Classname is :" + dataSource.getClass().getName());
		System.out.println("JDBCTemplate Object is ready: " + jdbcTemplate.getClass().getName());
	}

}
