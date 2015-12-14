package com.ulacit.devappweb.service;

import java.util.List;

import javax.jws.WebService;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.appfuse.service.GenericManager;

import com.ulacit.devappweb.dto.HeaderStateDTO;
import com.ulacit.devappweb.model.HeaderState;

@WebService
@Path("/headerStates")
public interface HeaderStateManager extends GenericManager<HeaderState, Long> {

	@GET
	@Path("/findByName/")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	List<HeaderStateDTO> findByName(@QueryParam("name") String name);

	@GET
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	List<HeaderStateDTO> getHeaderStates();
	// http://localhost:8080/services/api/headerStates

}
