package com.ulacit.devappweb.dao.hibernate;

import org.appfuse.dao.hibernate.GenericDaoHibernate;
import org.springframework.stereotype.Repository;

import com.ulacit.devappweb.dao.DishIngredientDao;
import com.ulacit.devappweb.model.DishIngredient;

@Repository("dishIngredientDao")
public class DishIngredientDaoHibernate extends GenericDaoHibernate<DishIngredient, Long> implements DishIngredientDao {

	public DishIngredientDaoHibernate() {
		super(DishIngredient.class);
	}

}