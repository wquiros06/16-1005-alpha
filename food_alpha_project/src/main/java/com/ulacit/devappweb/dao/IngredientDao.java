package com.ulacit.devappweb.dao;
 


import com.ulacit.devappweb.model.Ingredient;

import java.util.List;

import org.appfuse.dao.GenericDao;

public interface IngredientDao extends GenericDao<Ingredient, Long> {
	public List<Ingredient> findByName(String name);
 
}