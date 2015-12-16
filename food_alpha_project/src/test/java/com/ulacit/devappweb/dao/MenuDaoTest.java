package com.ulacit.devappweb.dao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.appfuse.dao.BaseDaoTestCase;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;

import com.ulacit.devappweb.model.Menu;

public class MenuDaoTest extends BaseDaoTestCase {
	@Autowired
	private MenuDao menuDao;

	@Test(expected = DataAccessException.class)
	public void testAddAndRemoveMenu() throws Exception {
		Menu menu = new Menu();
		final String startDate = "2015-12-07";
		final String endDate ="2015-12-11";
		menu.setStartDate(startDate);
		menu.setEndDate(endDate);

		menu = menuDao.save(menu);
		flush();

		menu = menuDao.get(menu.getMenuId());

		assertEquals(startDate, menu.getStartDate());
		assertNotNull(menu.getMenuId());

		log.debug("removing menu...");

		menuDao.remove(menu.getMenuId());
		flush();

		// should throw DataAccessException
		menuDao.get(menu.getMenuId());
	}
}