package com.ulacit.devappweb.service.impl;

import org.appfuse.service.impl.BaseManagerMockTestCase; 
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import com.ulacit.devappweb.dao.DishDao;
import com.ulacit.devappweb.model.Dish;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertSame;
import static org.mockito.BDDMockito.*;

public class DishManagerImplTest extends BaseManagerMockTestCase {

    @InjectMocks
    private DishManagerImpl manager;

    @Mock
    private DishDao dao;

    @Test
    public void testGetDish() {
        log.debug("testing get...");
        //given
        final Long id = 1L;
        final Dish dish = new Dish();
        given(dao.get(id)).willReturn(dish);

        //when
        Dish result = manager.get(id);

        //then
        assertSame(dish, result);
    }

    @Test
    public void testGetDishes() {
        log.debug("testing getAll...");
        //given
        final List dishes = new ArrayList();
        given(dao.getAll()).willReturn(dishes);

        //when
        List result = manager.getAll();

        //then
        assertSame(dishes, result);
    }

    @Test
    public void testSaveDish() {
        log.debug("testing save...");

        //given
        final Dish dish = new Dish();
        // enter all required fields

        given(dao.save(dish)).willReturn(dish);

        //when
        manager.save(dish);

        //then
        verify(dao).save(dish);
    }

    @Test
    public void testRemoveDish() {

        log.debug("testing remove...");

        //given
        final Long id = 1L;
        willDoNothing().given(dao).remove(id);

        //when
        manager.remove(id);

        //then
        verify(dao).remove(id);
    }
    
}
