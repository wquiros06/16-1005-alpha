package com.ulacit.devappweb.dto;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * 
 * @author Desarrollo
 *
 */
@XmlRootElement(name = "header_state")
public class HeaderStateDTO {
	private int headerStateId;
	private String name;
	private String description;

	public HeaderStateDTO() {
		super();
	}

	/**
	 * @param headerStateId
	 * @param name
	 * @param description
	 */
	public HeaderStateDTO(int headerStateId, String name, String description) {
		super();
		this.headerStateId = headerStateId;
		this.name = name;
		this.description = description;
	}

	/**
	 * @return the headerStateId
	 */
	public int getHeaderStateId() {
		return headerStateId;
	}

	/**
	 * @param headerStateId
	 *            the headerStateId to set
	 */
	public void setHeaderStateId(int headerStateId) {
		this.headerStateId = headerStateId;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description
	 *            the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

}
