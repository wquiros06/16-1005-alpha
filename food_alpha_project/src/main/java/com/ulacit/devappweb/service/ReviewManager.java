package com.ulacit.devappweb.service;

import java.util.List;

import javax.jws.WebService;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.appfuse.service.GenericManager;

import com.ulacit.devappweb.dto.ReviewDTO;
import com.ulacit.devappweb.model.Review;

@WebService
@Path("/reviews")
public interface ReviewManager extends GenericManager<Review, Long> {

	@GET
	@Path("/findByRating/")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	List<ReviewDTO> findByRating(@QueryParam("rating") String rating);

	@GET
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	List<ReviewDTO> getReviews();

}
