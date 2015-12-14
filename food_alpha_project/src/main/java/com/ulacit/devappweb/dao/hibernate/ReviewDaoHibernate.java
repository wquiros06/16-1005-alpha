package com.ulacit.devappweb.dao.hibernate;

import java.util.List;

import org.appfuse.dao.hibernate.GenericDaoHibernate;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.ulacit.devappweb.dao.ReviewDao;
import com.ulacit.devappweb.model.Review;


@Repository("reviewDao")
public class ReviewDaoHibernate extends GenericDaoHibernate<Review, Long> implements ReviewDao {

	public ReviewDaoHibernate() {
		super(Review.class);
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<Review> findByRating(String rating) {
		return getSession().createCriteria(Review.class).add(Restrictions.eq("rating", rating)).list();
	}

}