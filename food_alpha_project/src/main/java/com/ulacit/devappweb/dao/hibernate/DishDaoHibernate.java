package com.ulacit.devappweb.dao.hibernate;

import org.appfuse.dao.hibernate.GenericDaoHibernate;
import org.springframework.stereotype.Repository;

import com.ulacit.devappweb.dao.DishDao;
import com.ulacit.devappweb.model.Dish;
@Repository("dishDao")
public class DishDaoHibernate extends GenericDaoHibernate<Dish, Long> implements DishDao {

	public DishDaoHibernate() {
		super(Dish.class);
	}

}