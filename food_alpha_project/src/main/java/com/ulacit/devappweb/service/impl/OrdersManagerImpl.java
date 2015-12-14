package com.ulacit.devappweb.service.impl;

import java.util.List;

import javax.jws.WebService;

import org.appfuse.service.impl.GenericManagerImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ulacit.devappweb.dao.OrdersDao;
import com.ulacit.devappweb.dto.OrdersDTO;
import com.ulacit.devappweb.mapper.OrdersMapper;
import com.ulacit.devappweb.model.Orders;
import com.ulacit.devappweb.service.OrdersManager;

@Transactional
@Service("orderManager")
@WebService(serviceName = "OrderService", endpointInterface = "com.ulacit.devappweb.service.OrdersManager")
public class OrdersManagerImpl extends GenericManagerImpl<Orders, Long> implements OrdersManager {
	OrdersDao dao;

	public OrdersManagerImpl() {
	}

	@Autowired
	public OrdersManagerImpl(OrdersDao dao) {
		super(dao);
		this.dao = dao;
	}

	@Override
	public List<OrdersDTO> getOrders() {
		log.debug("STARTING getOrders [OrdersManagerImpl]...");
		List<OrdersDTO> ordersDTOs = null;
		List<Orders> orders = dao.getAll();			
		
		ordersDTOs = OrdersMapper.INSTANCE.orderstoOrdersDTOs(orders);

		log.debug("[ordersDTOs]..." + ordersDTOs.size());
		
		return ordersDTOs;
	}
}
