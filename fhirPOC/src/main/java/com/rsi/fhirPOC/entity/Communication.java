package com.rsi.fhirPOC.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Communication {

	@Id
	@Column(name="communication_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String id ;

	private String reference_id ;
	
	private Extension modifierExtention ;
	
	private CodeableConcept language ;
	
	private boolean preffered ; 
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "patient_id", nullable = false)
	private Patient patient ;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getReference_id() {
		return reference_id;
	}

	public void setReference_id(String reference_id) {
		this.reference_id = reference_id;
	}

	public Extension getModifierExtention() {
		return modifierExtention;
	}

	public void setModifierExtention(Extension modifierExtention) {
		this.modifierExtention = modifierExtention;
	}

	public CodeableConcept getLanguage() {
		return language;
	}

	public void setLanguage(CodeableConcept language) {
		this.language = language;
	}

	public boolean isPreffered() {
		return preffered;
	}

	public void setPreffered(boolean preffered) {
		this.preffered = preffered;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}


}
