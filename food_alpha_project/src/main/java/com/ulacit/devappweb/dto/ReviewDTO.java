/**
 * 
 */
package com.ulacit.devappweb.dto;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Desarrollo
 *
 */
@XmlRootElement(name = "review")
public class ReviewDTO {
	private Long reviewId;
	private String rating;
	private String comment;

	/**
	 * 
	 */
	public ReviewDTO() {
		super();
	}

	/**
	 * @param reviewId
	 * @param rating
	 * @param comment
	 */
	public ReviewDTO(Long reviewId, String rating, String comment) {
		super();
		this.reviewId = reviewId;
		this.rating = rating;
		this.comment = comment;
	}

	/**
	 * @return the reviewId
	 */
	public Long getReviewId() {
		return reviewId;
	}

	/**
	 * @param reviewId
	 *            the reviewId to set
	 */
	public void setReviewId(Long reviewId) {
		this.reviewId = reviewId;
	}

	/**
	 * @return the rating
	 */
	public String getRating() {
		return rating;
	}

	/**
	 * @param rating
	 *            the rating to set
	 */
	public void setRating(String rating) {
		this.rating = rating;
	}

	/**
	 * @return the comment
	 */
	public String getComment() {
		return comment;
	}

	/**
	 * @param comment
	 *            the comment to set
	 */
	public void setComment(String comment) {
		this.comment = comment;
	}

}
