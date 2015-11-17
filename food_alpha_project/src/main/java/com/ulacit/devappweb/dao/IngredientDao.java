package com.ulacit.devappweb.dao;
 

import org.appfuse.dao.GenericDao;

import com.ulacit.devappweb.model.Ingredient;

import java.util.List;

public interface IngredientDao extends GenericDao<Ingredient, Long> {
	public List<Ingredient> findByName(String name);
 
}