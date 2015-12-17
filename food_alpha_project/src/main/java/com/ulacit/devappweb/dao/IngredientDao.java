package com.ulacit.devappweb.dao;
 


import com.ulacit.devappweb.model.Ingredient;

import java.util.List;

import org.appfuse.dao.GenericDao;

/**
 * @author Desarrollo
 *
 */
public interface IngredientDao extends GenericDao<Ingredient, Long> {
	/**
	 * @param name
	 * @return a list of ingredients
	 */
	public List<Ingredient> findByName(String name);
 
}