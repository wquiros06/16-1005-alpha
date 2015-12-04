package com.ulacit.devappweb.model;
 
import javax.persistence.Column;
import javax.persistence.Entity; 
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import org.appfuse.model.BaseObject;

import com.fasterxml.jackson.annotation.JsonIgnore; 

@SuppressWarnings("serial")
@XmlRootElement
@Entity
@Table(name = "dish")
public class Dish extends BaseObject {
	private Long dishId;
	private String name;
	private String description;
	private Long photo;
	private Order order;
	private Menu menu;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "dish_id", unique = true, nullable = false)
	public Long getDishId() {
		return dishId;
	}

	public void setDishId(Long dishId) {
		this.dishId = dishId;
	}

	@Column(name = "name", length = 100)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Column(name = "description", length = 255)
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	@Column(name = "photo")
	public Long getPhoto() {
		return photo;
	}

	public void setPhoto(Long photo) {
		this.photo = photo;
	}
	
	@ManyToOne
	@JoinColumn(name = "order_id", nullable = false)
	@JsonIgnore	
	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}
	
	@ManyToOne
	@JoinColumn(name = "menu_id", nullable = false)
	@JsonIgnore	
	public Menu getMenu() {
		return menu;
	}

	public void setMenu(Menu menu) {
		this.menu = menu;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((dishId == null) ? 0 : dishId.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((photo == null) ? 0 : photo.hashCode());
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
		Dish other = (Dish) obj;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (dishId == null) {
			if (other.dishId != null)
				return false;
		} else if (!dishId.equals(other.dishId))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (photo == null) {
			if (other.photo != null)
				return false;
		} else if (!photo.equals(other.photo))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Dish [dishId=" + dishId + ", name=" + name + ", description=" + description + ", photo=" + photo + "]";
	}

	
	
}
