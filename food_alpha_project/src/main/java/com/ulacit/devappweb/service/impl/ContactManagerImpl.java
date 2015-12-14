/**
 * 
 */
package com.ulacit.devappweb.service.impl;

import java.util.List;

import javax.jws.WebService;

import org.appfuse.service.impl.GenericManagerImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ulacit.devappweb.dao.ContactDao;
import com.ulacit.devappweb.dto.ContactDTO;
import com.ulacit.devappweb.mapper.ContactMapper;
import com.ulacit.devappweb.model.Contact;
import com.ulacit.devappweb.service.ContactManager;


/**
 * @author Desarrollo
 *
 */
@Transactional
@Service("contactManager")
@WebService(serviceName = "ContactService", endpointInterface = "com.ulacit.devappweb.service.ContactManager")
public class ContactManagerImpl extends GenericManagerImpl<Contact, Long> implements ContactManager {
		ContactDao dao;

		public ContactManagerImpl() {
		}

		@Autowired
		public ContactManagerImpl(ContactDao dao) {
			super(dao);
			this.dao = dao;
		}

		@Override
		public ContactDTO findByEmail(String email) {
			log.debug("STARTING findByEmail [ContactManagerImpl]...");
			ContactDTO contactDTO = null;
			Contact contact = dao.findByEmail(email);
			contactDTO = ContactMapper.INSTANCE.contacttoContactDTO(contact);

			return contactDTO;
		}

		@Override
		public List<ContactDTO> getContacts() {
			log.debug("STARTING getContacts [ContactManagerImpl]...");
			List<ContactDTO> contactsDTOs = null;
			List<Contact> contacts = dao.getAll();			
			
			contactsDTOs = ContactMapper.INSTANCE.contactstoContactsDTOs(contacts);

			log.debug("[contactsDTOs]..." + contactsDTOs.size());
			
			return contactsDTOs;
		}


}
