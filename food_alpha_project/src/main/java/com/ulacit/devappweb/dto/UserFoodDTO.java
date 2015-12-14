package com.ulacit.devappweb.dto;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Desarrollo
 *
 */
@XmlRootElement(name = "user_food")
public class UserFoodDTO {
	private Long userFoodId;
	private String userName;
	private String password;
	private Integer attempt;
	private boolean state;
	private boolean adminApp;

	public UserFoodDTO() {
		super();
	}

	/**
	 * @param userFoodId
	 * @param userName
	 * @param password
	 * @param attempt
	 * @param state
	 */
	public UserFoodDTO(Long userFoodId, String userName, String password, Integer attempt, boolean state,
			boolean adminApp) {
		super();
		this.userFoodId = userFoodId;
		this.userName = userName;
		this.password = password;
		this.attempt = attempt;
		this.state = state;
		this.adminApp = adminApp;
	}

	/**
	 * @return the userFoodId
	 */
	public Long getUserFoodId() {
		return userFoodId;
	}

	/**
	 * @param userFoodId
	 *            the userFoodId to set
	 */
	public void setUserFoodId(Long userFoodId) {
		this.userFoodId = userFoodId;
	}

	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName
	 *            the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password
	 *            the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the attempt
	 */
	public Integer getAttempt() {
		return attempt;
	}

	/**
	 * @param attempt
	 *            the attempt to set
	 */
	public void setAttempt(Integer attempt) {
		this.attempt = attempt;
	}

	/**
	 * @return the state
	 */
	public boolean isState() {
		return state;
	}

	/**
	 * @param state
	 *            the state to set
	 */
	public void setState(boolean state) {
		this.state = state;
	}

	/**
	 * @return the adminApp
	 */
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

}
