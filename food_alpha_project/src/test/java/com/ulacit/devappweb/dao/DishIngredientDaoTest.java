/**
 * 
 */
package com.ulacit.devappweb.dao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.appfuse.dao.BaseDaoTestCase;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;

import com.ulacit.devappweb.model.DishIngredient;

/**
 * @author Desarrollo
 *
 */
public class DishIngredientDaoTest extends BaseDaoTestCase {
	@Autowired
	private DishIngredientDao dao;


	@Test(expected = DataAccessException.class)
	public void testAddAndRemove() throws Exception {
		final Long dishId = 10L;
		final Long ingredientId = 4L;
		final Long quantity = 2L;
		final String measure = "new";

		DishIngredient dish = new DishIngredient();
		dish.setDishId(dishId);
		dish.setIngredientId(ingredientId);
		dish.setQuantity(quantity);
		dish.setMeasure(measure);

		dish = dao.save(dish);
		flush();

		dish = dao.get(dish.getDishId());

		assertEquals(measure, dish.getMeasure());
		assertNotNull(dish.getDishId());

		log.debug("removing dish...");

		dao.remove(dish.getDishId());
		flush();

		// should throw DataAccessException
		dao.get(dish.getDishId());
	}

}
