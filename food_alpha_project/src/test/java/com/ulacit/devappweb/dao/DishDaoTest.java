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
    

    @Test(expected=DataAccessException.class)
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