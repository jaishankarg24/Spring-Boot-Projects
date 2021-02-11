package com.example.springboot.basic;

import org.springframework.boot.SpringApplication;



import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootJdbcProjectApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(SpringBootJdbcProjectApplication.class, args);

		System.out.println("Container Name is :" + applicationContext.getClass().getName()+"\n\n");
	}

}
 