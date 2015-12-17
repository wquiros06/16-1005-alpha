package com.ulacit.devappweb.dao;

import org.appfuse.dao.GenericDao;

import com.ulacit.devappweb.model.Contact;

/**
 * @author Desarrollo
 *
 */
public interface ContactDao extends GenericDao<Contact, Long> {
	/**
	 * @param email
	 * @return a Contact object
	 */
	public Contact findByEmail(String email);
}
