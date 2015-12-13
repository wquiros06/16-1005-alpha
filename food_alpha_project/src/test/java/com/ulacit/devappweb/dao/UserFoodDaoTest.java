package com.ulacit.devappweb.dao;

import static org.junit.Assert.*;

import org.appfuse.dao.BaseDaoTestCase;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;

import com.ulacit.devappweb.model.UserFood;

public class UserFoodDaoTest extends BaseDaoTestCase {
	@Autowired
	private UserFoodDao dao;

	@Test
	public void testFindByUserName() throws Exception {
		final String userName = "wquiros";
		UserFood userFood = null;
		log.debug("searching user food...");
		userFood = dao.findByUserName(userName);
		log.debug("find user food...");
		assertNotNull(userFood);
	}

	@Test(expected = DataAccessException.class)
	public void testAddAndRemoveStudents() throws Exception {
		final String userName = "emonge";
		final String password = "123";
		final Integer attempt = 0;
		final boolean state = true;

		UserFood userFood = new UserFood();
		userFood.setUserName(userName);
		userFood.setPassword(password);
		userFood.setAttempt(attempt);
		userFood.setState(state);

		userFood = dao.save(userFood);
		flush();

		userFood = dao.get(userFood.getUserFoodId());

		assertEquals(userName, userFood.getUserName());
		assertNotNull(userFood);

		log.debug("removing user food...");

		dao.remove(userFood.getUserFoodId());
		flush();

		// should throw DataAccessException
		dao.get(userFood.getUserFoodId());
	}

}
