package com.ulacit.devappweb.dao;

import java.util.List;

import org.appfuse.dao.GenericDao;

import com.ulacit.devappweb.model.Order;

public interface OrderDao extends GenericDao<Order, Long> {
	public List<Order> findByDateOrder(String dateOrder);

}
