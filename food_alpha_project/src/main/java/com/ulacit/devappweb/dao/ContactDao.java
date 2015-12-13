package com.ulacit.devappweb.dao;

import org.appfuse.dao.GenericDao;

import com.ulacit.devappweb.model.Contact;

public interface ContactDao extends GenericDao<Contact, Long> {
	public Contact findByEmail(String email);
}
