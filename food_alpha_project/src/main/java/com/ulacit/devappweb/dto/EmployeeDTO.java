package com.ulacit.devappweb.dto;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "employee")
public class EmployeeDTO {
	private Long employeeId;
	private String identity;
	private String name;
	private String lastName;

	
	
	public EmployeeDTO() {
		super();
	}
	public EmployeeDTO(Long employeeId, String identity, String name, String lastName) {
		super();
		this.employeeId = employeeId;
		this.identity = identity;
		this.name = name;
		this.lastName = lastName;
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
	@Override
	public String toString() {
		return "EmployeeDTO [employeeId=" + employeeId + ", identity=" + identity + ", name=" + name + ", lastName="
				+ lastName + "]";
	}
	
	
	
}
