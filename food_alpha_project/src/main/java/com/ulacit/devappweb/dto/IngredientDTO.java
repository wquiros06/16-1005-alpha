package com.ulacit.devappweb.dto;

import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement(name = "ingredient")
public class IngredientDTO {
	private Long id;
	private String name;

	public IngredientDTO() {
		super();
	}

	public IngredientDTO(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
