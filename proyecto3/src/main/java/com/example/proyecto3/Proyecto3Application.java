package com.example.proyecto3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;



@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class Proyecto3Application {

	public static void main(String[] args) {
		SpringApplication.run(Proyecto3Application.class, args);
	}

}
/// olvidar