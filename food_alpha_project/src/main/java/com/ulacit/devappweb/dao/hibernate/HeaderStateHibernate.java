package com.ulacit.devappweb.dao.hibernate;

import java.util.List;

import org.appfuse.dao.hibernate.GenericDaoHibernate;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.ulacit.devappweb.dao.HeaderStateDao;
import com.ulacit.devappweb.model.HeaderState;

@Repository("headerStateDao")
public class HeaderStateHibernate extends GenericDaoHibernate<HeaderState, Long> implements HeaderStateDao {

	public HeaderStateHibernate() {
		super(HeaderState.class);
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<HeaderState> findByName(String name) {
		return getSession().createCriteria(HeaderState.class).add(Restrictions.eq("name", name)).list();
	}


}
