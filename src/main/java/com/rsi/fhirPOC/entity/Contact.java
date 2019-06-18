package com.rsi.fhirPOC.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Contact {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="contact_id")
	private String id ;

	private String reference_id ;
	
	private Extension modifierExtention ;

	@OneToMany(cascade = CascadeType.ALL,
            fetch = FetchType.LAZY,
            mappedBy = "contact")
	private List<CodeableConcept> relationship ;
	
	@OneToMany(cascade = CascadeType.ALL,
            fetch = FetchType.LAZY,
            mappedBy = "contact")
	private HumanName name ;
	
	@OneToMany(cascade = CascadeType.ALL,
            fetch = FetchType.LAZY,
            mappedBy = "contact")
	private List<ContactPoint> telecom ;
	
	 @OneToOne(fetch = FetchType.LAZY,
	            cascade =  CascadeType.ALL,
	            mappedBy = "contact")
	private Address address ;
	
	private String gender ;
	
	 @OneToOne(fetch = FetchType.LAZY,
	            cascade =  CascadeType.ALL,
	            mappedBy = "contact")
	private Reference organization ;
	
	private Date periodStartDate ;
	
	private Date periodEndDate ;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "patient_id", nullable = false)
	private Patient patient;
	
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

	public List<CodeableConcept> getRelationship() {
		return relationship;
	}

	public void setRelationship(List<CodeableConcept> relationship) {
		this.relationship = relationship;
	}

	public HumanName getName() {
		return name;
	}

	public void setName(HumanName name) {
		this.name = name;
	}

	public List<ContactPoint> getTelecom() {
		return telecom;
	}

	public void setTelecom(List<ContactPoint> telecom) {
		this.telecom = telecom;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Reference getOrganization() {
		return organization;
	}

	public void setOrganization(Reference organization) {
		this.organization = organization;
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

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public void setPeriodEndDate(Date periodEndDate) {
		this.periodEndDate = periodEndDate;
	}


}
