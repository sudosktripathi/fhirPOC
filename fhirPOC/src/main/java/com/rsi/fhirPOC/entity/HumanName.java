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

@Entity
public class HumanName {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="humanName_id")
	private String id ;

	private String reference_id ;
	
	private Extension[] extension ;

	private String use ;

	private String text ;

	private String family ;

	private String[] givenName ;

	private String[] prefix ;

	private String[] suffix ;

	private Date periodStartDate ;

	private Date periodEndDate ;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "patient_id", nullable = false)
	private Patient patient ;
	
	@ManyToOne(fetch = FetchType.LAZY)
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

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getFamily() {
		return family;
	}

	public void setFamily(String family) {
		this.family = family;
	}

	public String[] getGivenName() {
		return givenName;
	}

	public void setGivenName(String[] givenName) {
		this.givenName = givenName;
	}

	public String[] getPrefix() {
		return prefix;
	}

	public void setPrefix(String[] prefix) {
		this.prefix = prefix;
	}

	public String[] getSuffix() {
		return suffix;
	}

	public void setSuffix(String[] suffix) {
		this.suffix = suffix;
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

	public Contact getContact() {
		return contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}
}
