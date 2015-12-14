package com.ulacit.devappweb.dao;
 
import com.ulacit.devappweb.model.Review;

import java.util.List;

import org.appfuse.dao.GenericDao;

public interface ReviewDao extends GenericDao<Review, Long> {
	public List<Review> findByRating(String rating);
}