package com.ulacit.devappweb.dto;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * 
 * @author Desarrollo
 *
 */
@XmlRootElement(name = "menu")
public class MenuDTO {
	private Long menuId;
	private String startDate;
	private String endDate;

	public MenuDTO() {
		super();
	}

	/**
	 * @param menuId
	 * @param startDate
	 * @param endDate
	 */
	public MenuDTO(Long menuId, String startDate, String endDate) {
		super();
		this.menuId = menuId;
		this.startDate = startDate;
		this.endDate = endDate;
	}

	/**
	 * @return the menuId
	 */
	public Long getMenuId() {
		return menuId;
	}

	/**
	 * @param menuId
	 *            the menuId to set
	 */
	public void setMenuId(Long menuId) {
		this.menuId = menuId;
	}

	/**
	 * @return the startDate
	 */
	public String getStartDate() {
		return startDate;
	}

	/**
	 * @param startDate
	 *            the startDate to set
	 */
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	/**
	 * @return the endDate
	 */
	public String getEndDate() {
		return endDate;
	}

	/**
	 * @param endDate
	 *            the endDate to set
	 */
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

}
