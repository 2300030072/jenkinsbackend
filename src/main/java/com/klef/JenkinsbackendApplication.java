package com.klef;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class JenkinsbackendApplication extends SpringBootServletInitializer{

	public static void main(String[] args)   {
		SpringApplication.run(JenkinsbackendApplication.class, args);
		System.out.println("Backend is running........");
	}

}
