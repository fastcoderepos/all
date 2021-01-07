package com.fastcode.azzz333;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = {"com.fastcode.azzz333"})
public class Azzz333Application {

	public static void main(String[] args) {
		SpringApplication.run(Azzz333Application.class, args);
	}

}

