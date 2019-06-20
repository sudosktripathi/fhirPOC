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
public class Coding {

	@Id
	@Column(name="coding_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String id ;

	private String reference_id ;
	
	private String system ;
	
	private String version ;
	
	private String code ;
	
	private String display ;
	
	private boolean userSelected ;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "meta_id", nullable = false)
	private Meta metaSecurity ;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "meta_id", nullable = false)
	private Meta metaTag ;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "codeableConcept_id", nullable = false)
	private CodeableConcept codeableConcept ;
	

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

	public String getSystem() {
		return system;
	}

	public void setSystem(String system) {
		this.system = system;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDisplay() {
		return display;
	}

	public void setDisplay(String display) {
		this.display = display;
	}

	public boolean isUserSelected() {
		return userSelected;
	}

	public void setUserSelected(boolean userSelected) {
		this.userSelected = userSelected;
	}

	public Meta getMetaSecurity() {
		return metaSecurity;
	}

	public void setMetaSecurity(Meta metaSecurity) {
		this.metaSecurity = metaSecurity;
	}

	public Meta getMetaTag() {
		return metaTag;
	}

	public void setMetaTag(Meta metaTag) {
		this.metaTag = metaTag;
	}

	public CodeableConcept getCodeableConcept() {
		return codeableConcept;
	}

	public void setCodeableConcept(CodeableConcept codeableConcept) {
		this.codeableConcept = codeableConcept;
	}
}
