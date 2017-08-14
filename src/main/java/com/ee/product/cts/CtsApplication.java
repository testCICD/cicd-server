package com.ee.product.cts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
@SpringBootApplication
public class CtsApplication {

	public static void main(String[] args) {
		SpringApplication.run(CtsApplication.class, args);
	}
}
