package com.rsi.fhirPOC.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Identifier {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="identifier_id")
	private String id ;

	private String reference_id ;
	
	private Extension[] extension ;

	private String use ;
	
	@OneToOne(fetch = FetchType.LAZY,
            cascade =  CascadeType.ALL,
            mappedBy = "identifier")
	private CodeableConcept type ;
	
	private String uri ;
	
	private String value ;
	
	private Date periodStartDate ;
	
	private Date periodEndDate ;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "patient_id", nullable = false)
	private Patient patient;
	
	@OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "reference_id", nullable = false)
	private Reference reference ;
	
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

	public String getUse() {
		return use;
	}

	public void setUse(String use) {
		this.use = use;
	}

	public CodeableConcept getType() {
		return type;
	}

	public void setType(CodeableConcept type) {
		this.type = type;
	}

	public String getUri() {
		return uri;
	}

	public void setUri(String uri) {
		this.uri = uri;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public Date getPeriodStartDate() {
		return periodStartDate;
	}

	public void setPeriodStartDate(Date periodStartDate) {
		this.periodStartDate = periodStartDate;
	}

	public Date getPeriodEndDate() {
		return periodEndDate;
	}

	public void setPeriodEndDate(Date periodEndDate) {
		this.periodEndDate = periodEndDate;
	}

	public Extension[] getExtension() {
		return extension;
	}

	public void setExtension(Extension[] extension) {
		this.extension = extension;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public Reference getReference() {
		return reference;
	}

	public void setReference(Reference reference) {
		this.reference = reference;
	}


}
