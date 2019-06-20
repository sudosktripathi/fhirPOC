package com.rsi.fhirPOC;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

@Configuration
public class FhirWebMvcConfig {
	
	/*
	 * @Bean public WebMvcConfigurationSupport forwardToIndex() { return new
	 * WebMvcConfigurationSupport() {
	 * 
	 * @Override public void addViewControllers(ViewControllerRegistry registry) {
	 * // forward requests to /admin and /user to their index.html
	 * registry.addViewController("/").setViewName(
	 * "forward:/patientRegistration.html");
	 * 
	 * } }; }
	 */

}
