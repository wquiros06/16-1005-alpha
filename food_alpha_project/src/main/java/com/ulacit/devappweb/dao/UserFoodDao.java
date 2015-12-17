package com.ulacit.devappweb.dao;

import org.appfuse.dao.GenericDao;

import com.ulacit.devappweb.model.UserFood;

/**
 * @author Desarrollo
 *
 */
public interface UserFoodDao extends GenericDao<UserFood, Long> {
	/**
	 * @param userName
	 * @return a userFood object
	 */
	public UserFood findByUserName(String userName);

}
