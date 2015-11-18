package com.ulacit.devappweb.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import org.appfuse.model.BaseObject;

@XmlRootElement
@Entity
@Table(name = "ingredient")
public class DishIngredient extends BaseObject {
	private Long dishId;
	private Long ingredientId;
	private Long quantity;
	private String measure;

	// START SNIPPET: personId
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "dish_Id", unique = true, nullable = false)
	public Long getDishId() {
		return dishId;
	}
	// END SNIPET: personId

	public void setDishId(Long dishId) {
		this.dishId = dishId;
	}

	@Column(name = "ingredient_id", length = 50)
	public Long getIngredientId() {
		return ingredientId;
	}

	public void setIngredientId(Long ingredientId) {
		this.ingredientId = ingredientId;
	}

	@Column(name = "quantity", length = 50)
	public Long getQuantity() {
		return quantity;
	}

	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}

	@Column(name = "measure", length = 50)
	public String getMeasure() {
		return measure;
	}

	public void setMeasure(String measure) {
		this.measure = measure;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dishId == null) ? 0 : dishId.hashCode());
		result = prime * result + ((ingredientId == null) ? 0 : ingredientId.hashCode());
		result = prime * result + ((measure == null) ? 0 : measure.hashCode());
		result = prime * result + ((quantity == null) ? 0 : quantity.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DishIngredient other = (DishIngredient) obj;
		if (dishId == null) {
			if (other.dishId != null)
				return false;
		} else if (!dishId.equals(other.dishId))
			return false;
		if (ingredientId == null) {
			if (other.ingredientId != null)
				return false;
		} else if (!ingredientId.equals(other.ingredientId))
			return false;
		if (measure == null) {
			if (other.measure != null)
				return false;
		} else if (!measure.equals(other.measure))
			return false;
		if (quantity == null) {
			if (other.quantity != null)
				return false;
		} else if (!quantity.equals(other.quantity))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "DishIngredient [dishId=" + dishId + ", ingredientId=" + ingredientId + ", quantity=" + quantity
				+ ", measure=" + measure + "]";
	}

}
