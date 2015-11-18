package com.ulacit.devappweb.dao.hibernate;

import org.appfuse.dao.hibernate.GenericDaoHibernate;
import org.springframework.stereotype.Repository;

import com.ulacit.devappweb.dao.ReviewDao;
import com.ulacit.devappweb.model.Review;
@Repository("reviewDao")
public class ReviewDaoHibernate extends GenericDaoHibernate<Review, Long> implements ReviewDao {

	public ReviewDaoHibernate() {
		super(Review.class);
	}

}