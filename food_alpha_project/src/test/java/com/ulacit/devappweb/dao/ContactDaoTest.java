package com.ulacit.devappweb.dao;

import static org.junit.Assert.*;

import org.appfuse.dao.BaseDaoTestCase;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;

import com.ulacit.devappweb.model.Contact;

public class ContactDaoTest extends BaseDaoTestCase {
	@Autowired
	private ContactDao dao;
	
	@Test
	public void testFindByEmail() throws Exception {
		final String email = "wquirosr086@ulacit.ed.cr";
		Contact contact = null;
		contact = dao.findByEmail(email);
		log.debug("find contact...");
		assertNotNull(contact);
	}
	
	@Test(expected = DataAccessException.class)
	public void testAddAndRemoveContacts() throws Exception {
		final String email = "wquiros06@gmail.com";

		Contact contact = new Contact();
		contact.setEmail(email);

		contact = dao.save(contact);
		flush();

		contact = dao.get(contact.getContactId());

		assertEquals(email,contact.getEmail());
		assertNotNull(contact);

		log.debug("removing contact...");

		dao.remove(contact.getContactId());
		flush();

		// should throw DataAccessException
		dao.get(contact.getContactId());
	}

}
