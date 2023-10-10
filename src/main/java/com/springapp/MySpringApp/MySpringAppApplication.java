package com.springapp.MySpringApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class MySpringAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(MySpringAppApplication.class, args);
		System.out.println("Server is started, This is my first Spring project. Hello Spring...");

	}

	@RequestMapping
	public String helloname() {
		return "Hello Prathamesh. This is your first spring web app.";
	}

}
