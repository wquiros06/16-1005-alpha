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

import com.ulacit.devappweb.dao.ReviewDao;
import com.ulacit.devappweb.model.Review;

public class ReviewManagerImplTest extends BaseManagerMockTestCase {

	@InjectMocks
	private ReviewManagerImpl manager;

	@Mock
	private ReviewDao dao;

	@Test
	public void testGet() {
		log.debug("testing get...");
		// given
		final Long id = 1L;
		final Review review = new Review();
		given(dao.get(id)).willReturn(review);

		// when
		Review result = manager.get(id);

		// then
		assertSame(review, result);
	}

	@Test
	public void testGetAll() {
		log.debug("testing getAll...");
		// given
		final List reviews = new ArrayList();
		given(dao.getAll()).willReturn(reviews);

		// when
		List result = manager.getAll();

		// then
		assertSame(reviews, result);
	}

	@Test
	public void testSave() {
		log.debug("testing save...");

		// given
		final Review review = new Review();
		// enter all required fields

		given(dao.save(review)).willReturn(review);

		// when
		manager.save(review);

		// then
		verify(dao).save(review);
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
