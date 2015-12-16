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

import com.ulacit.devappweb.dao.MenuDao;
import com.ulacit.devappweb.model.Menu;

public class MenuManagerImplTest extends BaseManagerMockTestCase {

	@InjectMocks
	private MenuManagerImpl manager;

	@Mock
	private MenuDao dao;

	@Test
	public void testGet() {
		log.debug("testing get...");
		// given
		final Long id = 1L;
		final Menu menu = new Menu();
		given(dao.get(id)).willReturn(menu);

		// when
		Menu result = manager.get(id);

		// then
		assertSame(menu, result);
	}

	@Test
	public void testGetAll() {
		log.debug("testing getAll...");
		// given
		final List menues = new ArrayList();
		given(dao.getAll()).willReturn(menues);

		// when
		List result = manager.getAll();

		// then
		assertSame(menues, result);
	}

	@Test
	public void testSave() {
		log.debug("testing save...");

		// given
		final Menu menu = new Menu();
		// enter all required fields

		given(dao.save(menu)).willReturn(menu);

		// when
		manager.save(menu);

		// then
		verify(dao).save(menu);
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
