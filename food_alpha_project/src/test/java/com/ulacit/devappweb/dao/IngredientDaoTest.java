package com.ulacit.devappweb.dao;

import static org.junit.Assert.*;

import java.util.List;

import org.appfuse.dao.BaseDaoTestCase;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;

import com.ulacit.devappweb.model.Ingredient;

public class IngredientDaoTest extends BaseDaoTestCase {
	@Autowired
	private IngredientDao ingredientDao;

	@Test
	public void testFindIngredientByFirstName() throws Exception {
		List<Ingredient> ingredients = ingredientDao.findByName("Culantro");
		assertTrue(ingredients.size() > 0);
	}

	@Test(expected = DataAccessException.class)
	public void testAddAndRemoveIngredient() throws Exception {
		Ingredient ingredient = new Ingredient();
		ingredient.setName("Carne");

		ingredient = ingredientDao.save(ingredient);
		flush();

		ingredient = ingredientDao.get(ingredient.getId());

		assertEquals("Carne", ingredient.getName());
		assertNotNull(ingredient.getId());

		log.debug("removing ingredient...");

		ingredientDao.remove(ingredient.getId());
		flush();

		// should throw DataAccessException
		ingredientDao.get(ingredient.getId());
	}
}
