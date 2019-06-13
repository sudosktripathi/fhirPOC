package com.rsi.fhirPOC.controller;

import javax.ws.rs.Path;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

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