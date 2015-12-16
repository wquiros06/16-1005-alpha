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

import com.ulacit.devappweb.dao.OrdersDao;
import com.ulacit.devappweb.model.Orders;


public class OrdersManagerImplTest extends BaseManagerMockTestCase {

	@InjectMocks
	private OrdersManagerImpl manager;

	@Mock
	private OrdersDao dao;

	@Test
	public void testGet() {
		log.debug("testing get...");
		// given
		final Long id = 1L;
		final Orders order = new Orders();
		given(dao.get(id)).willReturn(order);

		// when
		Orders result = manager.get(id);

		// then
		assertSame(order, result);
	}

	@Test
	public void testGetAll() {
		log.debug("testing getAll...");
		// given
		final List orders = new ArrayList();
		given(dao.getAll()).willReturn(orders);

		// when
		List result = manager.getAll();

		// then
		assertSame(orders, result);
	}

	@Test
	public void testSave() {
		log.debug("testing save...");

		// given
		final Orders order = new Orders();
		// enter all required fields

		given(dao.save(order)).willReturn(order);

		// when
		manager.save(order);

		// then
		verify(dao).save(order);
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
