package com.ulacit.devappweb.service.impl;

import java.util.List;

import javax.jws.WebService;

import org.appfuse.service.impl.GenericManagerImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ulacit.devappweb.dao.IngredientDao;
import com.ulacit.devappweb.dto.IngredientDTO;
import com.ulacit.devappweb.mapper.IngredientMapper;
import com.ulacit.devappweb.model.Ingredient;
import com.ulacit.devappweb.service.IngredientManager;

@Transactional
@Service("ingredientManager")
@WebService(serviceName = "IngredientService", endpointInterface = "com.ulacit.devappweb.IngredientManager")
public class IngredientManagerImpl extends GenericManagerImpl<Ingredient, Long> implements IngredientManager {
	IngredientDao ingredientDao;

	public IngredientManagerImpl() {
	}

	@Autowired
	public IngredientManagerImpl(IngredientDao ingredientDao) {
		super(ingredientDao);
		this.ingredientDao = ingredientDao;
	}

	public List<IngredientDTO> findByName(String name) {
		List<IngredientDTO> ingredientDTOs = null;
		List<Ingredient> ingredientList = ingredientDao.findByName(name);

		ingredientDTOs = IngredientMapper.INSTANCE.ingredientsToIngredientsDTOs(ingredientList);

		return ingredientDTOs;
	}

	public List<IngredientDTO> getIngredients() {
		List<IngredientDTO> ingredientDTOs = null;
		List<Ingredient> ingredientList = ingredientDao.getAll();

		ingredientDTOs = IngredientMapper.INSTANCE.ingredientsToIngredientsDTOs(ingredientList);

		return ingredientDTOs;
	}
}