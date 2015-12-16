package com.ulacit.devappweb.dao;

import static org.junit.Assert.*;

import java.util.List;

import org.appfuse.dao.BaseDaoTestCase;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;

import com.ulacit.devappweb.model.DetailState;

public class DetailStateDaoTest extends BaseDaoTestCase {
	@Autowired
	private DetailStateDao detailStateDao;

	@Test
	public void testFindDetails() throws Exception {
		List<DetailState> details = detailStateDao.findByName("Active");
		assertTrue(details.size() > 0);
	}

	
	@Test(expected = DataAccessException.class)
	public void testAddAndRemoveDetails() throws Exception {
		final String name = "New";

		DetailState detail = new DetailState();
		detail.setName(name);

		detail = detailStateDao.save(detail);
		
		flush();

		detail = detailStateDao.get(detail.getDetailStateId());

		assertEquals(name, detail.getName());
		assertNotNull(detail);

		log.debug("removing detail...");

		detailStateDao.remove(detail.getDetailStateId());
		flush();

		// should throw DataAccessException
		detailStateDao.get(detail.getDetailStateId());
	}
}