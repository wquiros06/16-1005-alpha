package com.ulacit.devappweb.dao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.appfuse.dao.BaseDaoTestCase;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;

import com.ulacit.devappweb.model.Review;


public class ReviewDaoTest extends BaseDaoTestCase {
	@Autowired
	private ReviewDao dao;
	
	@Test
	public void testFindByRaiting() throws Exception {
		final String rating = "4";
		List<Review> reviews = dao.findByRating(rating);
		log.debug("find review...");
		assertNotNull(reviews);
	}
	
	@Test(expected = DataAccessException.class)
	public void testAddAndRemoveReviews() throws Exception {
		final String rating = "5";
		final String comment = "good";

		Review review = new Review();
		review.setRating(rating);
		review.setComment(comment);

		review = dao.save(review);
		flush();

		review = dao.get(review.getReviewId());

		assertEquals(comment,review.getComment());
		assertNotNull(review);

		log.debug("removing review...");

		dao.remove(review.getReviewId());
		flush();

		// should throw DataAccessException
		dao.get(review.getReviewId());
	}

}
