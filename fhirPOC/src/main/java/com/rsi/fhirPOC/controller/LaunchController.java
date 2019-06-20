package com.rsi.fhirPOC.controller;

import javax.ws.rs.Path;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Path("/")
public class LaunchController {
	
	@RequestMapping("/")
	public String home() {

		return "patientRegistration.html";
	}
	
}