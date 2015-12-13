/**
 * 
 */
package com.ulacit.devappweb.service;


import javax.ws.rs.core.MediaType;

import java.util.List;

import javax.jws.WebService;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import org.appfuse.service.GenericManager;

import com.ulacit.devappweb.dto.EmployeeDTO;
import com.ulacit.devappweb.model.Employee;

/**
 * @author Desarrollo
 *
 */
@WebService
@Path("/employees")
public interface EmployeeManager extends GenericManager<Employee, Long> {

	@GET
	@Path("/findByName/")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	List<EmployeeDTO> findByName(@QueryParam("name") String name);
	
	@GET
	@Path("/findByLastName/")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	List<EmployeeDTO> findByLastName(@QueryParam("lastname") String lastName);
	
	@GET
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	List<EmployeeDTO> getEmployees();

}
