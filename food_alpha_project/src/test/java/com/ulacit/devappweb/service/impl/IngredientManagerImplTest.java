package com.ulacit.devappweb.service.impl;

import org.appfuse.service.impl.BaseManagerMockTestCase; 
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import com.ulacit.devappweb.dao.IngredientDao;
import com.ulacit.devappweb.model.Ingredient;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertSame;
import static org.mockito.BDDMockito.*;

public class IngredientManagerImplTest extends BaseManagerMockTestCase {

    @InjectMocks
    private IngredientManagerImpl manager;

    @Mock
    private IngredientDao dao;

    @Test
    public void testGetIngredient() {
        log.debug("testing get...");
        //given
        final Long id = 1L;
        final Ingredient ingredient = new Ingredient();
        given(dao.get(id)).willReturn(ingredient);

        //when
        Ingredient result = manager.get(id);

        //then
        assertSame(ingredient, result);
    }

    @Test
    public void testGetIngredients() {
        log.debug("testing getAll...");
        //given
        final List ingredients = new ArrayList();
        given(dao.getAll()).willReturn(ingredients);

        //when
        List result = manager.getAll();

        //then
        assertSame(ingredients, result);
    }

    @Test
    public void testSaveIngredient() {
        log.debug("testing save...");

        //given
        final Ingredient ingredient = new Ingredient();
        // enter all required fields

        given(dao.save(ingredient)).willReturn(ingredient);

        //when
        manager.save(ingredient);

        //then
        verify(dao).save(ingredient);
    }

    @Test
    public void testRemoveIngredient() {
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
