package com.in28minutes.springboot.firstspringbootproject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@ComponentScan({"com.in27minutes.springboot.firstspringbootproject"})
public class FirstSpringbootProjectApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(FirstSpringbootProjectApplication.class, args);
	}

}
