package com.ulacit.devappweb.dto;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * 
 * @author Desarrollo
 *
 */
@XmlRootElement(name = "contact")
public class ContactDTO {
	private Long contactId;
	private String email;

	public ContactDTO() {
		super();
	}

	/**
	 * @param contactId
	 * @param email
	 */
	public ContactDTO(Long contactId, String email) {
		super();
		this.contactId = contactId;
		this.email = email;
	}

	public Long getContactId() {
		return contactId;
	}

	public void setContactId(Long contactId) {
		this.contactId = contactId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
