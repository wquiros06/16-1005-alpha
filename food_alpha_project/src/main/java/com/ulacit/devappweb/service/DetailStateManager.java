package com.ulacit.devappweb.service;

import java.util.List;

import javax.jws.WebService;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.appfuse.service.GenericManager;

import com.ulacit.devappweb.dto.DetailStateDTO;
import com.ulacit.devappweb.model.DetailState;

@WebService
@Path("/detailStates")
public interface DetailStateManager extends GenericManager<DetailState, Long> {
	
	@GET
	@Path("/findByName/")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	List<DetailStateDTO> findByName(@QueryParam("name") String name);
	
	
	@GET
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	List<DetailStateDTO> getDetailStates();
}
