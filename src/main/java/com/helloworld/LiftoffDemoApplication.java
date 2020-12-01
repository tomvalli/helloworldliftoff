package com.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping
@SpringBootApplication
public class LiftoffDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(LiftoffDemoApplication.class, args);
	}

}
