package com.ulacit.devappweb.service.impl;

import static org.junit.Assert.assertSame;
import static org.mockito.BDDMockito.given;
import static org.mockito.BDDMockito.willDoNothing;
import static org.mockito.Mockito.verify;

import java.util.ArrayList;
import java.util.List;

import org.appfuse.service.impl.BaseManagerMockTestCase;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import com.ulacit.devappweb.dao.UserFoodDao;
import com.ulacit.devappweb.model.UserFood;


public class UserFoodManagerImplTest extends BaseManagerMockTestCase {

	@InjectMocks
	private UserFoodManagerImpl manager;

	@Mock
	private UserFoodDao dao;

	@Test
	public void testGet() {
		log.debug("testing get...");
		// given
		final Long id = 1L;
		final UserFood userFood = new UserFood();
		given(dao.get(id)).willReturn(userFood);

		// when
		UserFood result = manager.get(id);

		// then
		assertSame(userFood, result);
	}

	@Test
	public void testGetAll() {
		log.debug("testing getAll...");
		// given
		final List usersFood = new ArrayList();
		given(dao.getAll()).willReturn(usersFood);

		// when
		List result = manager.getAll();

		// then
		assertSame(usersFood, result);
	}

	@Test
	public void testSave() {
		log.debug("testing save...");

		// given
		final UserFood userFood = new UserFood();
		// enter all required fields

		given(dao.save(userFood)).willReturn(userFood);

		// when
		manager.save(userFood);

		// then
		verify(dao).save(userFood);
	}

	@Test
	public void testRemove() {

		log.debug("testing remove...");

		// given
		final Long id = 1L;
		willDoNothing().given(dao).remove(id);

		// when
		manager.remove(id);

		// then
		verify(dao).remove(id);
	}

}
