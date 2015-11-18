package com.ulacit.devappweb.dao;

import org.appfuse.dao.BaseDaoTestCase; 
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;

import com.ulacit.devappweb.model.Dish;

import java.util.List;

import static org.junit.Assert.*;

public class DishDaoTest extends BaseDaoTestCase {
    @Autowired
    private DishDao dishDao;

    @Test
    public void testFindDishByName() throws Exception {
        List<Dish> dishes = dishDao.findByName("ArrozconPollo");
        assertTrue(dishes.size() > 0);
    }
    
/*
    @Test(expected=DataAccessException.class)
    public void testAddAndRemoveIngredient() throws Exception {
        Dish dish = new Dish();
        dish.setName("Cantones");

        dish = DishDao.save(dish);
        flush();

        dish = DishDao.get(dish.getId());

        assertEquals("Cantones", dish.getName());
        assertNotNull(dish.getId());

        log.debug("removing ingredient...");

        ingredientDao.remove(ingredient.getId());
        flush();

        // should throw DataAccessException
        ingredientDao.get(ingredient.getId());
    }
*/
}