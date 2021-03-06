package com.ulacit.devappweb.service;

import org.appfuse.service.GenericManager;

import com.ulacit.devappweb.dto.IngredientDTO;
import com.ulacit.devappweb.model.Ingredient;

import javax.jws.WebService;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import java.util.List;

@WebService
@Path("/ingredients")
public interface IngredientManager extends GenericManager<Ingredient, Long> {

	@GET
	@Path("{name}")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	List<IngredientDTO> findByName(@PathParam("name") String firstname);
	// URL: /services/api/people/Matt
 
 
	
	@GET
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	List<IngredientDTO> getIngredients();
}