/**
 * 
 */
package com.ulacit.devappweb.service;

import java.util.List;

import javax.jws.WebService;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.appfuse.service.GenericManager;

import com.ulacit.devappweb.dto.ContactDTO;
import com.ulacit.devappweb.model.Contact;

/**
 * @author Desarrollo
 *
 */
@WebService
@Path("/contacts")
public interface ContactManager extends GenericManager<Contact, Long> {

	@GET
	@Path("/findByEmail/")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	ContactDTO findByEmail(@QueryParam("email") String email);

	@GET
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	List<ContactDTO> getContacts();
	//http://localhost:8080/services/api/contacts

}
