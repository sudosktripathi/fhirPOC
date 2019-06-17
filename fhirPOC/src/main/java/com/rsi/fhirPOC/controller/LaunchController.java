package com.rsi.fhirPOC.controller;

import javax.ws.rs.Path;

import org.hl7.fhir.dstu3.model.Patient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ca.uhn.fhir.context.FhirContext;
import ca.uhn.fhir.parser.IParser;

@RestController
@Path("/")
public class LaunchController {
	
	@GetMapping
	@Path(value = "hello")
	public String sayHello()
	{
		return "Hello there !";
	}
	
	
}