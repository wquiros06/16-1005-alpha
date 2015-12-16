package com.ulacit.devappweb.dao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.appfuse.dao.BaseDaoTestCase;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;

import com.ulacit.devappweb.model.HeaderState;

public class HeaderStateDaoTest  extends BaseDaoTestCase {
	@Autowired
	private HeaderStateDao headerStateDao;

	@Test
	public void testFindHeaders() throws Exception {
		List<HeaderState> headers = headerStateDao.findByName("User's states");
		assertTrue(headers.size() > 0);
	}
	
	@Test(expected = DataAccessException.class)
	public void testAddAndRemoveHeader() throws Exception {
		final String name = "New";
		final String description ="New Header";
		HeaderState header = new HeaderState();
		header.setName(name);
		header.setDescription(description);

		
		header = headerStateDao.save(header);
		
		flush();

		header = headerStateDao.get((long) header.getHeaderStateId());

		assertEquals(name, header.getName());
		assertNotNull(header);

		log.debug("removing detail...");

		headerStateDao.remove((long)header.getHeaderStateId());
		flush();

		// should throw DataAccessException
		headerStateDao.get((long)header.getHeaderStateId());
	}
}
