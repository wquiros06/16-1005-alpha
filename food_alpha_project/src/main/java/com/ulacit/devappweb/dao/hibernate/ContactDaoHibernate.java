package com.ulacit.devappweb.dao.hibernate;

import org.appfuse.dao.hibernate.GenericDaoHibernate;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.ulacit.devappweb.dao.ContactDao;
import com.ulacit.devappweb.model.Contact;

@Repository("contactDao")
public class ContactDaoHibernate extends GenericDaoHibernate<Contact, Long> implements ContactDao {

	public ContactDaoHibernate() {
		super(Contact.class);
	}

	/* (non-Javadoc)
	 * @see com.ulacit.devappweb.dao.ContactDao#findByEmail(java.lang.String)
	 */
	@Override
	public Contact findByEmail(String email) {
		return (Contact) getSession().createCriteria(Contact.class).add(Restrictions.eq("email", email)).uniqueResult();
	}

}
