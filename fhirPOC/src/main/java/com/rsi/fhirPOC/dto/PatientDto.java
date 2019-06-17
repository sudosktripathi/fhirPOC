package com.rsi.fhir.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PatientDto {

   
    @JsonProperty("name")
    private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
    
    
}
