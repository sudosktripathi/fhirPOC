package com.rsi.fhirPOC;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import ca.uhn.fhir.context.FhirContext;
import ca.uhn.fhir.rest.server.interceptor.LoggingInterceptor;


/**
 * The Class FhirPocApplication.
 */
@SpringBootApplication
@Configuration
@ComponentScan("com")
@ServletComponentScan("com")
public class FhirPocApplication {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		SpringApplication.run(FhirPocApplication.class, args);

	}

	/**
	 * Logging interceptor.
	 *
	 * @return the logging interceptor
	 */
	@Bean
	public LoggingInterceptor loggingInterceptor() {
		return new LoggingInterceptor();

	}

	/**
	 * Fhir context.
	 *
	 * @return the fhir context
	 */
	@Bean
	public FhirContext fhirContext() {
		FhirContext fhirContext = FhirContext.forDstu3();
		return fhirContext;

	}

}
