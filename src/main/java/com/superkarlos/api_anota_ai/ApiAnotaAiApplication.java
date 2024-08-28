package com.superkarlos.api_anota_ai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories  // pra rodar os repositors mongo

public class ApiAnotaAiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiAnotaAiApplication.class, args);
	}

}
