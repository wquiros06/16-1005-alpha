package com.ulacit.devappweb.dao.hibernate;

import org.appfuse.dao.hibernate.GenericDaoHibernate;
import org.springframework.stereotype.Repository;
import com.ulacit.devappweb.dao.MenuDao;
import com.ulacit.devappweb.model.Menu;

@Repository("menuDao")
public class MenuDaoHibernate extends GenericDaoHibernate<Menu, Long> implements MenuDao {

	public MenuDaoHibernate() {
		super(Menu.class);
	}

}