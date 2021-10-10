package com.cachingexample.cachingapp;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CachingAppApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(CachingAppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Hello World!!1");
	}
}
