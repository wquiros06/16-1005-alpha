/**
 * 
 */
package com.ulacit.devappweb.dto;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * 
 * @author Desarrollo
 *
 */
@XmlRootElement(name = "detail_state")
public class DetailStateDTO {
	private Long detailStateId;
	private String name;

	/**
	 * 
	 */
	public DetailStateDTO() {
		super();
	}

	/**
	 * @param detailStateId
	 * @param name
	 */
	public DetailStateDTO(Long detailStateId, String name) {
		super();
		this.detailStateId = detailStateId;
		this.name = name;
	}

	/**
	 * @return the detailStateId
	 */
	public Long getDetailStateId() {
		return detailStateId;
	}

	/**
	 * @param detailStateId
	 *            the detailStateId to set
	 */
	public void setDetailStateId(Long detailStateId) {
		this.detailStateId = detailStateId;
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

}
