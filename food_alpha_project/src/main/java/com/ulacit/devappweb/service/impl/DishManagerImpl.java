package com.ulacit.devappweb.service.impl;

import java.util.List;

import javax.jws.WebService;

import org.appfuse.service.impl.GenericManagerImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ulacit.devappweb.dao.DishDao;
import com.ulacit.devappweb.model.Dish;
import com.ulacit.devappweb.service.DishManager;
@Transactional
@Service("dishManager")
@WebService(serviceName = "DishService", endpointInterface = "com.ulacit.devappweb.DishManager")
public class DishManagerImpl extends GenericManagerImpl<Dish, Long> implements DishManager {
	DishDao dishDao;

	public DishManagerImpl() {
	}

	@Autowired
	public DishManagerImpl(DishDao dishDao) {
		super(dishDao);
		this.dishDao = dishDao;
	}

	public List<Dish> findByName(String name) {
		List<Dish> dishList = dishDao.findByName(name);
		return dishList;
	}

	public List<Dish> getDishes() {
		List<Dish> dishesList = dishDao.getAll();

		//dishesList = IngredientMapper.INSTANCE.ingredientsToIngredientsDTOs(ingredientList);

		return dishesList;
	}
}