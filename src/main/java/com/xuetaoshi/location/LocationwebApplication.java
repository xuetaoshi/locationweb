package com.xuetaoshi.location;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan({"com.xuetaoshi.location.controllers", "com.xuetaoshi.location.service"})
public class LocationwebApplication {

	public static void main(String[] args) {
		SpringApplication.run(LocationwebApplication.class, args);
	}

}
