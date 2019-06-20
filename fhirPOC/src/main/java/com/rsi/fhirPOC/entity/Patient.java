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
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Patient {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="patient_id")
	private String id ;
	
    private String reference_id ;
    
    @OneToOne(fetch = FetchType.LAZY,
            cascade =  CascadeType.ALL,
            mappedBy = "patient")
	private Resource resource ;
	
	private Resource[] contained ;
	
	private Extension[] extension ;
	
	private Extension[] modifierExtension ;
	
	private String narrativeStatus ;
	
	private String narrativeDiv ;
	
	private boolean active ;
	
	@OneToMany(cascade = CascadeType.ALL,
            fetch = FetchType.LAZY,
            mappedBy = "patient")
	private List<Identifier> patientIdentifier ;
	
	@OneToMany(cascade = CascadeType.ALL,
            fetch = FetchType.LAZY,
            mappedBy = "patient")
	private List<HumanName> name ;
	
	@OneToMany(cascade = CascadeType.ALL,
            fetch = FetchType.LAZY,
            mappedBy = "patient")
	private List<ContactPoint> telecom ;
	
	private String gender ;
	
	private Date birthDate ;
	
	private boolean deceased ;
	
	private Date deceasedDate ;
	
	@OneToMany(cascade = CascadeType.ALL,
            fetch = FetchType.LAZY,
            mappedBy = "patient")
	private List<Address> address ;
	
	@OneToOne(fetch = FetchType.LAZY,
            cascade =  CascadeType.ALL,
            mappedBy = "patient")
	private CodeableConcept maritalStatus ;
	
	private boolean multipleBirthBoolean ;
	
	private int multipleBirthInteger ;
	
	
	private List<Attachment> photoUrl ;
	
	@OneToMany(cascade = CascadeType.ALL,
            fetch = FetchType.LAZY,
            mappedBy = "patient")
	private List<Contact> contact ;
	
	@OneToMany(cascade = CascadeType.ALL,
            fetch = FetchType.LAZY,
            mappedBy = "patient")
	private List<Communication> communication ;
	
	private List<Reference> generalPractitioner ;
	
	private Reference managingOrganization ; 
	
	private List<LinkedEntity> link ;
	
	//private Extension modifierExtenstion ; 
	
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

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public List<Identifier> getPatientIdentifier() {
		return patientIdentifier;
	}

	public void setPatientIdentifier(List<Identifier> patientIdentifier) {
		this.patientIdentifier = patientIdentifier;
	}

	public List<HumanName> getName() {
		return name;
	}

	public void setName(List<HumanName> name) {
		this.name = name;
	}

	public List<ContactPoint> getTelecom() {
		return telecom;
	}

	public void setTelecom(List<ContactPoint> telecom) {
		this.telecom = telecom;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public boolean isDeceased() {
		return deceased;
	}

	public void setDeceased(boolean deceased) {
		this.deceased = deceased;
	}

	public Date getDeceasedDate() {
		return deceasedDate;
	}

	public void setDeceasedDate(Date deceasedDate) {
		this.deceasedDate = deceasedDate;
	}

	public List<Address> getAddress() {
		return address;
	}

	public void setAddress(List<Address> address) {
		this.address = address;
	}

	public CodeableConcept getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(CodeableConcept maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public boolean isMultipleBirth() {
		return multipleBirthBoolean;
	}

	public void setMultipleBirth(boolean multipleBirth) {
		this.multipleBirthBoolean = multipleBirth;
	}

	public int getMultipleBirthInt() {
		return multipleBirthInteger;
	}

	public void setMultipleBirthInt(int multipleBirthInt) {
		this.multipleBirthInteger = multipleBirthInt;
	}

	public List<Contact> getContact() {
		return contact;
	}

	public void setContact(List<Contact> contact) {
		this.contact = contact;
	}

	public List<Communication> getCommunication() {
		return communication;
	}

	public void setCommunication(List<Communication> communication) {
		this.communication = communication;
	}

	public List<Reference> getGeneralPractitioner() {
		return generalPractitioner;
	}

	public void setGeneralPractitioner(List<Reference> generalPractitioner) {
		this.generalPractitioner = generalPractitioner;
	}

	public Reference getManagingOrganization() {
		return managingOrganization;
	}

	public void setManagingOrganization(Reference managingOrganization) {
		this.managingOrganization = managingOrganization;
	}

	public List<LinkedEntity> getLinkedEntity() {
		return link;
	}

	public void setLinkedEntity(List<LinkedEntity> linkedEntity) {
		this.link = linkedEntity;
	}

	public Resource getResource() {
		return resource;
	}

	public void setResource(Resource resource) {
		this.resource = resource;
	}

	public Resource[] getContained() {
		return contained;
	}

	public void setContained(Resource[] contained) {
		this.contained = contained;
	}

	public Extension[] getExtension() {
		return extension;
	}

	public void setExtension(Extension[] extension) {
		this.extension = extension;
	}

	public Extension[] getModifierExtension() {
		return modifierExtension;
	}

	public void setModifierExtension(Extension[] modifierExtension) {
		this.modifierExtension = modifierExtension;
	}

	public String getNarrativeStatus() {
		return narrativeStatus;
	}

	public void setNarrativeStatus(String narrativeStatus) {
		this.narrativeStatus = narrativeStatus;
	}

	public String getNarrativeDiv() {
		return narrativeDiv;
	}

	public void setNarrativeDiv(String narrativeDiv) {
		this.narrativeDiv = narrativeDiv;
	}

	public boolean isMultipleBirthBoolean() {
		return multipleBirthBoolean;
	}

	public void setMultipleBirthBoolean(boolean multipleBirthBoolean) {
		this.multipleBirthBoolean = multipleBirthBoolean;
	}

	public int getMultipleBirthInteger() {
		return multipleBirthInteger;
	}

	public void setMultipleBirthInteger(int multipleBirthInteger) {
		this.multipleBirthInteger = multipleBirthInteger;
	}

	public List<LinkedEntity> getLink() {
		return link;
	}

	public void setLink(List<LinkedEntity> link) {
		this.link = link;
	}

	public List<Attachment> getPhotoUrl() {
		return photoUrl;
	}

	public void setPhotoUrl(List<Attachment> photoUrl) {
		this.photoUrl = photoUrl;
	}

}
