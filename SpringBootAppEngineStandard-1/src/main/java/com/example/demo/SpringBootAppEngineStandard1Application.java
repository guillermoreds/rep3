package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableAutoConfiguration
public class SpringBootAppEngineStandard1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAppEngineStandard1Application.class, args);
	}
	
	@RequestMapping("/")
	String home() {
		return "Hello World!";
	}

}
