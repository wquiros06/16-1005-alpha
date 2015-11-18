package com.ulacit.devappweb.dao.hibernate;

import java.util.List;

import org.appfuse.dao.hibernate.GenericDaoHibernate;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.ulacit.devappweb.dao.DishDao;
import com.ulacit.devappweb.model.Dish;
@Repository("dishDao")
public class DishDaoHibernate extends GenericDaoHibernate<Dish, Long> implements DishDao {

	public DishDaoHibernate() {
		super(Dish.class);
	}

	@SuppressWarnings("unchecked")
	public List<Dish> findByName(String name) {
		return getSession().createCriteria(Dish.class).add(Restrictions.eq("name", name)).list();
	}
}