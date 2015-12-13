package com.ulacit.devappweb.service;

import java.util.List;

import javax.jws.WebService;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.appfuse.service.GenericManager;

import com.ulacit.devappweb.dto.OrdersDTO;
import com.ulacit.devappweb.model.Orders;

@WebService
@Path("/orders")
public interface OrdersManager extends GenericManager<Orders, Long> {

	@GET
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	List<OrdersDTO> getOrders();

}