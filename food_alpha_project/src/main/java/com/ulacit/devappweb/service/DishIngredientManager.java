package com.ulacit.devappweb.service;

import org.appfuse.service.GenericManager;

import com.ulacit.devappweb.dto.DishIngredientDTO;
import com.ulacit.devappweb.dto.IngredientDTO;
import com.ulacit.devappweb.model.DishIngredient;
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
@Path("/dishingredients")
public interface DishIngredientManager extends GenericManager<DishIngredient, Long> {

	@GET
	@Path("{dish_id}")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	List<DishIngredientDTO> findByDish(@PathParam("dish_id") Long dishId);
	// URL: /services/api/people/Matt
 
	@GET
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	List<DishIngredientDTO> getDishIngredients();
}