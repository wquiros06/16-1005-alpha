package com.ulacit.devappweb.dto;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "dishIngredient")
public class DishIngredientDTO {
	private Long dishId;
	private Long ingredientId;
	private Long quantity;
	private String measure;

	public DishIngredientDTO() {
		super();
	}

	public DishIngredientDTO(Long dishId, Long ingredientId, Long quantity, String measure) {
		super();
		this.dishId = dishId;
		this.ingredientId = ingredientId;
		this.quantity = quantity;
		this.measure = measure;
	}

	public Long getDishId() {
		return dishId;
	}

	public void setDishId(Long dishId) {
		this.dishId = dishId;
	}

	public Long getIngredientId() {
		return ingredientId;
	}

	public void setIngredientId(Long ingredientId) {
		this.ingredientId = ingredientId;
	}

	public Long getQuantity() {
		return quantity;
	}

	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}

	public String getMeasure() {
		return measure;
	}

	public void setMeasure(String measure) {
		this.measure = measure;
	}

}
