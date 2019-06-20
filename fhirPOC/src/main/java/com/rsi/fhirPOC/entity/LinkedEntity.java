package com.rsi.fhirPOC.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class LinkedEntity {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private String id ;
	
	private String reference_id ;
	
	private Extension[] modifierExtension ;
	
	private Reference other ;
	
	private String code ;
	
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

	public Extension[] getModifierExtension() {
		return modifierExtension;
	}

	public void setModifierExtension(Extension[] modifierExtension) {
		this.modifierExtension = modifierExtension;
	}

	public Reference getOther() {
		return other;
	}

	public void setOther(Reference other) {
		this.other = other;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	
}
