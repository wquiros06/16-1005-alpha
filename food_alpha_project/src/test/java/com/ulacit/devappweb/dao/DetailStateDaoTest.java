package com.ulacit.devappweb.dao;

import static org.junit.Assert.*;

import java.util.List;

import org.appfuse.dao.BaseDaoTestCase;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.ulacit.devappweb.model.DetailState;

public class DetailStateDaoTest extends BaseDaoTestCase {
	@Autowired
	private DetailStateDao detailStateDao;

	@Test
	public void testFindDetailsByName() throws Exception {
		List<DetailState> details = detailStateDao.findByName("Active");
		assertTrue(details.size() > 0);
	}

}