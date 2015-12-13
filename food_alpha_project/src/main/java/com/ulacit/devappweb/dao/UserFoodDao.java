package com.ulacit.devappweb.dao;

import org.appfuse.dao.GenericDao;

import com.ulacit.devappweb.model.UserFood;

public interface UserFoodDao extends GenericDao<UserFood, Long> {
	public UserFood findByUserName(String userName);

}
