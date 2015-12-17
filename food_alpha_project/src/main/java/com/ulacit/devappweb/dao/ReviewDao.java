package com.ulacit.devappweb.dao;
 
import com.ulacit.devappweb.model.Review;

import java.util.List;

import org.appfuse.dao.GenericDao;

/**
 * @author Desarrollo
 *
 */
public interface ReviewDao extends GenericDao<Review, Long> {
	/**
	 * @param rating
	 * @return a list of reviews
	 */
	public List<Review> findByRating(String rating);
}