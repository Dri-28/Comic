package com.project.Comic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;


@SpringBootApplication
@EnableFeignClients

public class ComicApplication {

	public static void main(String[] args) {
		SpringApplication.run(ComicApplication.class, args);
	}

}
