package com.ulacit.devappweb.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

import com.ulacit.devappweb.dto.ReviewDTO;
import com.ulacit.devappweb.model.Review;

@Mapper
public interface ReviewMapper {
	ReviewMapper INSTANCE = Mappers.getMapper(ReviewMapper.class);

	List<ReviewDTO> reviewstoReviewsDTOs(List<Review> reviews);

	@Mappings({ @Mapping(source = "reviewId", target = "reviewId"), @Mapping(source = "rating", target = "rating"),
			@Mapping(source = "comment", target = "comment") })
	ReviewDTO reviewtoReviewDTO(Review review);

}
