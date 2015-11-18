package com.ulacit.devappweb.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import org.appfuse.model.BaseObject;

@XmlRootElement
@Entity
@Table(name = "employee")
public class Employee extends BaseObject {
	private Long employeeId;
	private String identity;
	private String name;
	private String lastName;
	private Set<Contact> employeeContact;
	private Set<Order> employeeOrder;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "employee_id", unique = true, nullable = false)
	public Long getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(Long id) {
		this.employeeId = id;
	}
	
	@Column(name = "identity", length = 32)
	public String getIdentity() {
		return identity;
	}
	public void setIdentity(String identity) {
		this.identity = identity;
	}
	
	@Column(name = "name", length = 150)
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Column(name = "last_name", length = 150)
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "employee", cascade = CascadeType.ALL)
	public Set<Contact> getEmployeeContact() {
		return employeeContact;
	}
	public void setEmployeeContact(Set<Contact> employeeContact) {
		this.employeeContact = employeeContact;
	}
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "employee", cascade = CascadeType.ALL)
	public Set<Order> getEmployeeOrder() {
		return employeeOrder;
	}
	public void setEmployeeOrder(Set<Order> employeeOrder) {
		this.employeeOrder = employeeOrder;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((employeeId == null) ? 0 : employeeId.hashCode());
		result = prime * result + ((identity == null) ? 0 : identity.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		Employee other = (Employee) obj;
		if (employeeId == null) {
			if (other.employeeId != null)
				return false;
		} else if (!employeeId.equals(other.employeeId))
			return false;
		if (identity == null) {
			if (other.identity != null)
				return false;
		} else if (!identity.equals(other.identity))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", identity=" + identity + ", name=" + name + ", lastName="
				+ lastName + "]";
	}

}
