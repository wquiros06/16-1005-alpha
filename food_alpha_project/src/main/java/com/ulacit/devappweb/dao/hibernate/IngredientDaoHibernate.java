package com.ulacit.devappweb.dao.hibernate;

import java.util.List;

import org.appfuse.dao.hibernate.GenericDaoHibernate; 
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.ulacit.devappweb.dao.IngredientDao;
import com.ulacit.devappweb.model.Ingredient;

@Repository("ingredientDao")
public class IngredientDaoHibernate extends GenericDaoHibernate<Ingredient, Long>implements IngredientDao {

	public IngredientDaoHibernate() {
		super(Ingredient.class);
	}

	@SuppressWarnings("unchecked")
	public List<Ingredient> findByName(String name) {
		return getSession().createCriteria(Ingredient.class).add(Restrictions.eq("name", name)).list();
	}

 
}