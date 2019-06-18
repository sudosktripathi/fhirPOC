package com.rsi.fhirPOC.entity;

import java.util.Date;

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
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="address_id")
	private String id ;

	private String reference_id ;
	
	private Extension[] extension;
	
	private String use ;
	
	private String type ;
	
	private String text ;
	
	private String[] line ;
	
	private String city ;
	
	private String district ;
	
	private String state ;
	
	private String postalCode ;
	
	private String country ;
	
	private Date periodStartDate ;
	
	private Date periodEndDate ;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "patient_id", nullable = false)
	private Patient patient;
	
	@OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "contact_id", nullable = false)
	private Contact contact ;
	
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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String[] getLine() {
		return line;
	}

	public void setLine(String[] line) {
		this.line = line;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPostalcode() {
		return postalCode;
	}

	public void setPostalcode(String postalcode) {
		this.postalCode = postalcode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
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

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public Contact getContact() {
		return contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}

}
