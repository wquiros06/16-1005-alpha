package com.ulacit.devappweb.model;
 
import javax.persistence.Column;
import javax.persistence.Entity; 
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import org.appfuse.model.BaseObject;

import com.fasterxml.jackson.annotation.JsonIgnore; 

@SuppressWarnings("serial")
@XmlRootElement
@Entity
@Table(name = "review")
public class Review extends BaseObject {
	private Long reviewId;
	private Employee employee;
	private Dish dish;
	private String rating;
	private String comment;
	
	// START SNIPPET: Review
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "review_id", unique = true, nullable = false)
	public Long getReviewId() {
		return reviewId;
	}
	// END SNIPET: reviewId

	public void setReviewId(Long reviewId) {
		this.reviewId = reviewId;
	}

	@ManyToOne
	@JoinColumn(name = "employee_id", nullable = false)
	@JsonIgnore	
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
	@OneToOne
	@JoinColumn(name = "dish_id", nullable = false)
	@JsonIgnore	
	public Dish getDish() {
		return dish;
	}
	public void setDish(Dish dish) {
		this.dish = dish;
	}

	@Column(name = "rating", length = 5)
	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	@Column(name = "comment", length = 250)
	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((comment == null) ? 0 : comment.hashCode());
		result = prime * result + ((rating == null) ? 0 : rating.hashCode());
		result = prime * result + ((reviewId == null) ? 0 : reviewId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Review other = (Review) obj;
		if (comment == null) {
			if (other.comment != null)
				return false;
		} else if (!comment.equals(other.comment))
			return false;
		if (rating == null) {
			if (other.rating != null)
				return false;
		} else if (!rating.equals(other.rating))
			return false;
		if (reviewId == null) {
			if (other.reviewId != null)
				return false;
		} else if (!reviewId.equals(other.reviewId))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Review [reviewId=" + reviewId + ", rating=" + rating + ", comment=" + comment + "]";
	}

	
}
