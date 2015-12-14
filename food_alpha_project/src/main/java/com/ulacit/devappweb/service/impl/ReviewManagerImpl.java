package com.ulacit.devappweb.service.impl;

import java.util.List;

import javax.jws.WebService;

import org.appfuse.service.impl.GenericManagerImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ulacit.devappweb.dao.ReviewDao;
import com.ulacit.devappweb.dto.ReviewDTO;
import com.ulacit.devappweb.mapper.ReviewMapper;
import com.ulacit.devappweb.model.Review;
import com.ulacit.devappweb.service.ReviewManager;


@Transactional
@Service("reviewManager")
@WebService(serviceName = "ReviewService", endpointInterface = "com.ulacit.devappweb.service.ReviewManager")
public class ReviewManagerImpl extends GenericManagerImpl<Review, Long> implements ReviewManager {
	ReviewDao dao;

	public ReviewManagerImpl() {
	}

	@Autowired
	public ReviewManagerImpl(ReviewDao dao) {
		super(dao);
		this.dao = dao;
	}

	@Override
	public List<ReviewDTO> findByRating(String rating) {
		log.debug("STARTING findByRating [ReviewManagerImpl]...");
		List<ReviewDTO> reviewsDTOs = null;
		List<Review> reviews = dao.findByRating(rating);
		reviewsDTOs = ReviewMapper.INSTANCE.reviewstoReviewsDTOs(reviews);

		return reviewsDTOs;
	}

	@Override
	public List<ReviewDTO> getReviews() {
		log.debug("STARTING getReviews [ReviewManagerImpl]...");
		List<ReviewDTO> reviewsDTOs = null;
		List<Review> reviews = dao.getAll();			
		
		reviewsDTOs = ReviewMapper.INSTANCE.reviewstoReviewsDTOs(reviews);

		log.debug("[reviewsDTOs]..." + reviewsDTOs.size());
		
		return reviewsDTOs;
	}
}
