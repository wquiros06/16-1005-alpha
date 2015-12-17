package com.ulacit.devappweb.dao;
 
import com.ulacit.devappweb.model.Dish;

import java.util.List;

import org.appfuse.dao.GenericDao;

/**
 * @author Desarrollo
 *
 */
public interface DishDao extends GenericDao<Dish, Long> {
	/**
	 * @param name
	 * @return a list of diches
	 */
	public List<Dish> findByName(String name); 
}