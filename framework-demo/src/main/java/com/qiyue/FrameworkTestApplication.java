package com.qiyue;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
public class FrameworkTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(FrameworkTestApplication.class, args);
	}
}
