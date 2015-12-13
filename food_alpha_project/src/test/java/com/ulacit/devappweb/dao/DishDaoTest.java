package com.ulacit.devappweb.dao;

import static org.junit.Assert.*;

import java.util.List;

import org.appfuse.dao.BaseDaoTestCase;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;

import com.ulacit.devappweb.model.Dish;

public class DishDaoTest extends BaseDaoTestCase {
	@Autowired
	private DishDao dishDao;

	@Test
	public void testFindDishByName() throws Exception {
		final String name = "Arroz con Pollo";
		List<Dish> dishes = dishDao.findByName(name);
		assertTrue(dishes.size() > 0);
	}

	@Test(expected = DataAccessException.class)
	public void testAddAndRemoveDish() throws Exception {
		Dish dish = new Dish();
		dish.setName("Cantones");

		dish = dishDao.save(dish);
		flush();

		dish = dishDao.get(dish.getDishId());

		assertEquals("Cantones", dish.getName());
		assertNotNull(dish.getDishId());

		log.debug("removing dish...");

		dishDao.remove(dish.getDishId());
		flush();

		// should throw DataAccessException
		dishDao.get(dish.getDishId());
	}

}
