package com.ulacit.devappweb.dto;

import java.util.Arrays;
import java.util.Set;

import com.ulacit.devappweb.model.Contact;
import com.ulacit.devappweb.model.Order;

public class EmployeeDTO {
	private Long employeeId;
	private String identity;
	private String name;
	private String lastName;
	private Contact[] employeeContact;
	private Order[] employeeOrder;
	
	
	public EmployeeDTO() {
		super();
	}
	public EmployeeDTO(Long employeeId, String identity, String name, String lastName, Contact[] employeeContact,
			Order[] employeeOrder) {
		super();
		this.employeeId = employeeId;
		this.identity = identity;
		this.name = name;
		this.lastName = lastName;
		this.employeeContact = employeeContact;
		this.employeeOrder = employeeOrder;
	}
	public Long getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
	}
	public String getIdentity() {
		return identity;
	}
	public void setIdentity(String identity) {
		this.identity = identity;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Contact[] getEmployeeContact() {
		return employeeContact;
	}
	public void setEmployeeContact(Contact[] employeeContact) {
		this.employeeContact = employeeContact;
	}
	public Order[] getEmployeeOrder() {
		return employeeOrder;
	}
	public void setEmployeeOrder(Order[] employeeOrder) {
		this.employeeOrder = employeeOrder;
	}
	@Override
	public String toString() {
		return "EmployeeDTO [employeeId=" + employeeId + ", identity=" + identity + ", name=" + name + ", lastName="
				+ lastName + ", employeeContact=" + Arrays.toString(employeeContact) + ", employeeOrder="
				+ Arrays.toString(employeeOrder) + "]";
	}
	
	
}
