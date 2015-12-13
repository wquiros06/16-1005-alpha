package com.ulacit.devappweb.dto;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * 
 * @author Desarrollo
 *
 */
@XmlRootElement(name = "dish")
public class DishDTO {
	private Long dishId;
	private String name;
	private String description;
	private Long photo;

	public DishDTO() {
		super();
	}

	/**
	 * @param dishId
	 * @param name
	 * @param description
	 * @param photo
	 */
	public DishDTO(Long dishId, String name, String description, Long photo) {
		super();
		this.dishId = dishId;
		this.name = name;
		this.description = description;
		this.photo = photo;
	}

	/**
	 * @return the dishId
	 */
	public Long getDishId() {
		return dishId;
	}

	/**
	 * @param dishId
	 *            the dishId to set
	 */
	public void setDishId(Long dishId) {
		this.dishId = dishId;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description
	 *            the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the photo
	 */
	public Long getPhoto() {
		return photo;
	}

	/**
	 * @param photo
	 *            the photo to set
	 */
	public void setPhoto(Long photo) {
		this.photo = photo;
	}

}
