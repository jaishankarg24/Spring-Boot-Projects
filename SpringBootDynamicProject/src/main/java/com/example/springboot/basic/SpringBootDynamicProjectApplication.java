package com.example.springboot.basic;

import org.springframework.boot.SpringApplication;




import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootDynamicProjectApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(SpringBootDynamicProjectApplication.class, args);
		
		System.out.println("Implementation Class name is :"+applicationContext.getClass().getName());
	}

}
