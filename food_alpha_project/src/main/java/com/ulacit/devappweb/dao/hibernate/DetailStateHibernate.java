package com.ulacit.devappweb.dao.hibernate;

import java.util.List;

import org.appfuse.dao.hibernate.GenericDaoHibernate;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.ulacit.devappweb.dao.DetailStateDao;
import com.ulacit.devappweb.model.DetailState;

@Repository("detailsStateDao")
public class DetailStateHibernate extends GenericDaoHibernate<DetailState, Long> implements DetailStateDao {

	public DetailStateHibernate() {
		super(DetailState.class);
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<DetailState> findByName(String name) {
		return getSession().createCriteria(DetailState.class).add(Restrictions.eq("name", name)).list();
	}

}
