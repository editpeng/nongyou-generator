package com.nongyou.generator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class NongyouGeneratorApplication {

	public static void main(String[] args) {
		SpringApplication.run(NongyouGeneratorApplication.class, args);
	}
}
