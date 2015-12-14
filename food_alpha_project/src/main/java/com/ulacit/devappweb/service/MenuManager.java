package com.ulacit.devappweb.service;

import java.util.List;

import javax.jws.WebService;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.appfuse.service.GenericManager;

import com.ulacit.devappweb.dto.MenuDTO;
import com.ulacit.devappweb.model.Menu;

@WebService
@Path("/menues")
public interface MenuManager extends GenericManager<Menu, Long> {

	@GET
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	List<MenuDTO> getMenues();
	// http://localhost:8080/services/api/menues
}
