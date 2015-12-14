package com.ulacit.devappweb.service;

import java.util.List;

import javax.jws.WebService;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.appfuse.service.GenericManager;

import com.ulacit.devappweb.dto.UserFoodDTO;
import com.ulacit.devappweb.model.UserFood;


@WebService
@Path("/userFoods")
public interface UserFoodManager extends GenericManager<UserFood, Long> {

	@GET
	@Path("/isValidUserFood/")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	boolean isValidUserFood(@QueryParam("userName") String userName, @QueryParam("password") String password);
	
	@GET
	@Path("/findByUserName/")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	List<UserFoodDTO> findByUserName(@QueryParam("rating") String rating);

	@GET
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	List<UserFoodDTO> getuserFoods();
	//http://localhost:8080/services/api/userFoods

}
