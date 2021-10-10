package com.cachingexample.cachingapp;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class CachingAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(CachingAppApplication.class, args);
	}
}
