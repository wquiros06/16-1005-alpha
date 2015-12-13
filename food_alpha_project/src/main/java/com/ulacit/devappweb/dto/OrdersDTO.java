package com.ulacit.devappweb.dto;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * 
 * @author Desarrollo
 *
 */
@XmlRootElement(name = "orders")
public class OrdersDTO {
	private Long ordersId;
	private String dateOrder;

	public OrdersDTO() {
		super();
	}

	/**
	 * @param ordersId
	 * @param dateOrder
	 */
	public OrdersDTO(Long ordersId, String dateOrder) {
		super();
		this.ordersId = ordersId;
		this.dateOrder = dateOrder;
	}

	/**
	 * @return the ordersId
	 */
	public Long getOrdersId() {
		return ordersId;
	}

	/**
	 * @param ordersId
	 *            the ordersId to set
	 */
	public void setOrdersId(Long ordersId) {
		this.ordersId = ordersId;
	}

	/**
	 * @return the dateOrder
	 */
	public String getDateOrder() {
		return dateOrder;
	}

	/**
	 * @param dateOrder
	 *            the dateOrder to set
	 */
	public void setDateOrder(String dateOrder) {
		this.dateOrder = dateOrder;
	}

}
