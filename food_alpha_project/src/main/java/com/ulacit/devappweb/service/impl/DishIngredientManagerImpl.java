package com.ulacit.devappweb.service.impl;

import java.util.List;

import javax.jws.WebService;

import org.appfuse.service.impl.GenericManagerImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ulacit.devappweb.dao.DishIngredientDao;
import com.ulacit.devappweb.dao.IngredientDao;
import com.ulacit.devappweb.dto.DishIngredientDTO;
import com.ulacit.devappweb.dto.IngredientDTO;
import com.ulacit.devappweb.mapper.DishIngredientMapper;
import com.ulacit.devappweb.mapper.IngredientMapper;
import com.ulacit.devappweb.model.DishIngredient;
import com.ulacit.devappweb.model.Ingredient;
import com.ulacit.devappweb.service.DishIngredientManager;
import com.ulacit.devappweb.service.IngredientManager;

@Transactional
@Service("dishIngredientManager")
@WebService(serviceName = "DishIngredientService", endpointInterface = "com.ulacit.devappweb.DishIngredientManager")
public class DishIngredientManagerImpl extends GenericManagerImpl<DishIngredient, Long> implements DishIngredientManager {
	DishIngredientDao dishIngredientDao;

	public DishIngredientManagerImpl() {
	}

	@Autowired
	public DishIngredientManagerImpl(DishIngredientDao dishIngredientDao) {
		super(dishIngredientDao);
		this.dishIngredientDao = dishIngredientDao;
	}

	public List<DishIngredientDTO> findByDish(Long dishId) {
		List<DishIngredientDTO> dishIngredientDTOs = null;
		List<DishIngredient> dishIngredientList = dishIngredientDao.findByDishId(dishId) ;

		dishIngredientDTOs = DishIngredientMapper.INSTANCE.dishIngredientsToDishIngredientsDTOs(dishIngredientList);

		return dishIngredientDTOs;
	}

	public List<DishIngredientDTO> getDishIngredients() {
		List<DishIngredientDTO> dishIngredientDTOs = null;
		List<DishIngredient> dishIngredientList = dishIngredientDao.getAll();

		dishIngredientDTOs = DishIngredientMapper.INSTANCE.dishIngredientsToDishIngredientsDTOs(dishIngredientList);

		return dishIngredientDTOs;
	}
}