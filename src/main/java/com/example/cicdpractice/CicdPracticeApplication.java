package com.example.cicdpractice;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;


@RestController
@EnableAutoConfiguration
public class CicdPracticeApplication {

	@RequestMapping("/")
	    String home() {
		return "Hello World Spring Boot!";
	    }

	public static void main(String[] args) {
		SpringApplication.run(CicdPracticeApplication.class, args);
	}

}
