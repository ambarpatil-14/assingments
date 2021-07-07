package com.example.productcatalog.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Attributes {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id")
	private Long id;
	
	@Column(name="attributeName")
	private String attributeName;
	
	@Column(name="attributeValue")
	private String attributeValue;

	@OneToMany(mappedBy = "attribute")
	private List<Category> catagories;

	public Attributes(Long id, String attributeName, String attributeValue) {
		super();
		this.id = id;
		this.attributeName = attributeName;
		this.attributeValue = attributeValue;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAttributeName() {
		return attributeName;
	}

	public void setAttributeName(String attributeName) {
		this.attributeName = attributeName;
	}

	public String getAttributeValue() {
		return attributeValue;
	}

	public void setAttributeValue(String attributeValue) {
		this.attributeValue = attributeValue;
	}
	
	
}
