package com.ulacit.devappweb.dao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.appfuse.dao.BaseDaoTestCase;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;

import com.ulacit.devappweb.model.Orders;

public class OrdersDaoTest extends BaseDaoTestCase {
	@Autowired
	private OrdersDao dao;
	
	@Test(expected = DataAccessException.class)
	public void testAddAndRemoveOrder() throws Exception {
		log.debug("Start add testAddAndRemoveOrder ...");
		final String dateOrder = "2012-12-12";
		Orders order = new Orders();
		order.setDateOrder(dateOrder);

		log.debug("saving order ...");
		order = dao.save(order);
		flush();

		order = dao.get(order.getOrdersId());

		assertEquals(dateOrder,order.getDateOrder());
		assertNotNull(order.getOrdersId());

		log.debug("removing order...");

		dao.remove(order.getOrdersId());
		flush();

		// should throw DataAccessException
		dao.get(order.getOrdersId());
	}

}
