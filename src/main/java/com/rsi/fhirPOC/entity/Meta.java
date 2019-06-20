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
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Meta {
	
	@Id
	@Column(name="meta_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String id ;
	
	private String reference_id ;
	
	private Extension[] extension ;
	
	private Date lastUpdated ;
	
	private String source ;
	
	private String canonical ;
	
	@OneToMany(cascade = CascadeType.ALL,
            fetch = FetchType.LAZY,
            mappedBy = "metaSecurity")
	private List<Coding> security ;
	
	@OneToMany(cascade = CascadeType.ALL,
            fetch = FetchType.LAZY,
            mappedBy = "metaTag")
	private List<Coding> tag ;
	
	@OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "resource_id", nullable = false)
	private Resource resource ;

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

	public Extension[] getExtension() {
		return extension;
	}

	public void setExtension(Extension[] extension) {
		this.extension = extension;
	}

	public Date getLastUpdated() {
		return lastUpdated;
	}

	public void setLastUpdated(Date lastUpdated) {
		this.lastUpdated = lastUpdated;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getCanonical() {
		return canonical;
	}

	public void setCanonical(String canonical) {
		this.canonical = canonical;
	}

	public List<Coding> getSecurity() {
		return security;
	}

	public void setSecurity(List<Coding> security) {
		this.security = security;
	}

	public List<Coding> getTag() {
		return tag;
	}

	public void setTag(List<Coding> tag) {
		this.tag = tag;
	}

	public Resource getResource() {
		return resource;
	}

	public void setResource(Resource resource) {
		this.resource = resource;
	}
	
	

}
