package com.rsi.fhirPOC;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
public class FhirPocApplication {

	public static void main(String[] args) {
		SpringApplication.run(FhirPocApplication.class, args);
	}

}
