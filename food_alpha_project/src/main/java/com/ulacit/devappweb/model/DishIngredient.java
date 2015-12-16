/**
 * 
 */
package com.ulacit.devappweb.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import org.hibernate.annotations.NaturalId;

/**
 * @author Desarrollo
 *
 */
@XmlRootElement
@Entity
@Table(name = "dish_ingredient")
public class DishIngredient {
	private Long id;
	private Long dishId;
	private Long ingredientId;
	private Long quantity;
	private String measure;

	/**
	 * @return the id
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", unique = true, nullable = false)
	public Long getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the dishId
	 */
	@NaturalId
	@Column(name = "dish_id")
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
	 * @return the ingredientId
	 */
	@NaturalId
	@Column(name = "ingredient_id")
	public Long getIngredientId() {
		return ingredientId;
	}

	/**
	 * @param ingredientId
	 *            the ingredientId to set
	 */
	public void setIngredientId(Long ingredientId) {
		this.ingredientId = ingredientId;
	}

	/**
	 * @return the quantity
	 */
	@Column(name = "quantity", length = 50)
	public Long getQuantity() {
		return quantity;
	}

	/**
	 * @param quantity
	 *            the quantity to set
	 */
	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}

	/**
	 * @return the measure
	 */
	@Column(name = "measure", length = 50)
	public String getMeasure() {
		return measure;
	}

	/**
	 * @param measure
	 *            the measure to set
	 */
	public void setMeasure(String measure) {
		this.measure = measure;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dishId == null) ? 0 : dishId.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
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
		return "DishIngredient [id=" + id + ", dishId=" + dishId + ", ingredientId=" + ingredientId + ", quantity="
				+ quantity + ", measure=" + measure + "]";
	}

}
