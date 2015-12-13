/**
 * 
 */
package com.ulacit.devappweb.service;

import org.appfuse.service.GenericManager;

import com.ulacit.devappweb.dto.IngredientDTO;
import com.ulacit.devappweb.model.Ingredient;

import javax.jws.WebService;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import java.util.List;

/**
 * @author Desarrollo
 *
 */
@WebService
@Path("/ingredients")
public interface IngredientManager extends GenericManager<Ingredient, Long> {

	@GET
	@Path("/findByName/")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	List<IngredientDTO> findByName(@QueryParam("name") String name);

	@GET
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	List<IngredientDTO> getIngredients();
	
	@POST
	@Path("/create/")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	Boolean create(@QueryParam("name") String name);
	
	@POST
	@Path("/update/")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	Boolean create(@QueryParam("id") Long id,@QueryParam("name") String name);
	
	@POST
	@Path("/delete/")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	Boolean create(@QueryParam("id") Long id);
	
}
