package com.ulacit.devappweb.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import org.appfuse.model.BaseObject;

@SuppressWarnings("serial")
@XmlRootElement
@Entity
@Table(name = "user_food")
public class UserFood extends BaseObject {
	private Long userFoodId;
	private String userName;
	private String password;
	private Integer attempt;
	private boolean state;
	private boolean adminApp;
	private Employee employee;
	private DetailState detailState;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "user_food_id", unique = true, nullable = false)
	public Long getUserFoodId() {
		return userFoodId;
	}

	public void setUserFoodId(Long userFoodId) {
		this.userFoodId = userFoodId;
	}

	@Column(name = "user_name", length = 30)
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Column(name = "password", length = 30)
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Column(name = "attempt")
	public Integer getAttempt() {
		return attempt;
	}

	public void setAttempt(Integer attempt) {
		this.attempt = attempt;
	}

	@Column(name = "state")
	public boolean isState() {
		return state;
	}

	public void setState(boolean state) {
		this.state = state;
	}

	/**
	 * @return the adminApp
	 */
	@Column(name = "admin_app")
	public boolean isAdminApp() {
		return adminApp;
	}

	/**
	 * @param adminApp
	 *            the adminApp to set
	 */
	public void setAdminApp(boolean adminApp) {
		this.adminApp = adminApp;
	}

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "employee_id")
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
		result = prime * result + (adminApp ? 1231 : 1237);
		result = prime * result + ((attempt == null) ? 0 : attempt.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + (state ? 1231 : 1237);
		result = prime * result + ((userFoodId == null) ? 0 : userFoodId.hashCode());
		result = prime * result + ((userName == null) ? 0 : userName.hashCode());
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
		UserFood other = (UserFood) obj;
		if (adminApp != other.adminApp)
			return false;
		if (attempt == null) {
			if (other.attempt != null)
				return false;
		} else if (!attempt.equals(other.attempt))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (state != other.state)
			return false;
		if (userFoodId == null) {
			if (other.userFoodId != null)
				return false;
		} else if (!userFoodId.equals(other.userFoodId))
			return false;
		if (userName == null) {
			if (other.userName != null)
				return false;
		} else if (!userName.equals(other.userName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "UserFood [userFoodId=" + userFoodId + ", userName=" + userName + ", password=" + password + ", attempt="
				+ attempt + ", state=" + state + ", adminApp=" + adminApp + "]";
	}

}
