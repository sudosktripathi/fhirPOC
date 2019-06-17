package com.rsi.fhirPOC.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.rsi.fhirPOC.provider.PatientResourceProvider;

import ca.uhn.fhir.context.FhirContext;
import ca.uhn.fhir.rest.api.EncodingEnum;
import ca.uhn.fhir.rest.server.IResourceProvider;
import ca.uhn.fhir.rest.server.RestfulServer;

@Component
@Configuration
@WebServlet(urlPatterns = { "/fhir/*" }, displayName = "FHIR Server")
// Implementing Restful Server using HAPI FHIR Restfulserver class
public class FhirRestfulServlet extends RestfulServer {
	/**
	* 
	*/
	public FhirRestfulServlet() {
		super(FhirContext.forDstu3());
	}

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/**
	 * Initialize.
	 *
	 * @throws ServletException the servlet exception
	 */
	@Override
	protected void initialize() throws ServletException {
		/*
		 * The servlet defines any number of resource providers, and configures itself
		 * to use them by calling setResourceProviders()
		 */
		setDefaultResponseEncoding(EncodingEnum.JSON);
		System.out.println("inside ExampleRestfulServlet");
		FhirContext fhirContext = FhirContext.forDstu3();
		List<IResourceProvider> resourceProviders = new ArrayList<IResourceProvider>();
		resourceProviders.add(new PatientResourceProvider(fhirContext));

		setResourceProviders(resourceProviders);
	}
}
