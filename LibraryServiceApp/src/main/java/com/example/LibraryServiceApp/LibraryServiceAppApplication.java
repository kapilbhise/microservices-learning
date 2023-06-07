package com.example.LibraryServiceApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class LibraryServiceAppApplication {

	@Bean
	@Primary
	public RestTemplate getRestTemplate() {
		return new RestTemplate();

	}

	public static void main(String[] args) {
		SpringApplication.run(LibraryServiceAppApplication.class, args);
	}

}
