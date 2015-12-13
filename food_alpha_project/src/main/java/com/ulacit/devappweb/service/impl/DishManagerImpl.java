package com.ulacit.devappweb.service.impl;

import java.util.List;

import javax.jws.WebService;

import org.appfuse.service.impl.GenericManagerImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ulacit.devappweb.dao.DishDao;
import com.ulacit.devappweb.dto.DishDTO;
import com.ulacit.devappweb.mapper.DishMapper;
import com.ulacit.devappweb.model.Dish;
import com.ulacit.devappweb.service.DishManager;

@Transactional
@Service("dishManager")
@WebService(serviceName = "DishService", endpointInterface = "com.ulacit.devappweb.service.DishManager")
public class DishManagerImpl extends GenericManagerImpl<Dish, Long> implements DishManager {
	DishDao dishDao;

	public DishManagerImpl() {
	}

	@Autowired
	public DishManagerImpl(DishDao dishDao) {
		super(dishDao);
		this.dishDao = dishDao;
	}

	public List<DishDTO> findByName(String name) {
		List<DishDTO> dishesDTOs = null;
		List<Dish> dishes  = dishDao.findByName(name);

		dishesDTOs = DishMapper.INSTANCE.dishestoDishesDTOs(dishes);

		return dishesDTOs;
	}

	public List<DishDTO> getDishes() {
		List<DishDTO> dishesDTOs = null;
		List<Dish> dishes = dishDao.getAll();

		dishesDTOs = DishMapper.INSTANCE.dishestoDishesDTOs(dishes);

		return dishesDTOs;
	}
}
