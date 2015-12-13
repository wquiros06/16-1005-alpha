package com.ulacit.devappweb.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import org.appfuse.model.BaseObject;

@SuppressWarnings("serial")
@XmlRootElement
@Entity
@Table(name = "orders")
public class Orders extends BaseObject {
	private Long ordersId;
	private String dateOrder;
	private Set<Dish> ordersDish;
	private Employee employee;
	private DetailState detailState;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "orders_id", unique = true, nullable = false)
	public Long getOrdersId() {
		return ordersId;
	}

	public void setOrdersId(Long ordersId) {
		this.ordersId = ordersId;
	}

	@Column(name = "date_order", length = 32)
	public String getDateOrder() {
		return dateOrder;
	}

	public void setDateOrder(String dateOrder) {
		this.dateOrder = dateOrder;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "orders", cascade = CascadeType.ALL)
	public Set<Dish> getOrdersDish() {
		return ordersDish;
	}

	public void setOrdersDish(Set<Dish> ordersDish) {
		this.ordersDish = ordersDish;
	}

	@ManyToOne
	@JoinColumn(name = "employee_id", nullable = false)
	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "detail_state_id")	
	public DetailState getDetailState() {
		return detailState;
	}

	public void setDetailState(DetailState detailState) {
		this.detailState = detailState;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dateOrder == null) ? 0 : dateOrder.hashCode());
		result = prime * result + ((ordersId == null) ? 0 : ordersId.hashCode());
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
		Orders other = (Orders) obj;
		if (dateOrder == null) {
			if (other.dateOrder != null)
				return false;
		} else if (!dateOrder.equals(other.dateOrder))
			return false;
		if (ordersId == null) {
			if (other.ordersId != null)
				return false;
		} else if (!ordersId.equals(other.ordersId))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Orders [ordersId=" + ordersId + ", dateOrder=" + dateOrder + "]";
	}

}
