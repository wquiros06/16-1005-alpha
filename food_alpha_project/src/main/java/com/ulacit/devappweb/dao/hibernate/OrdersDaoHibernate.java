package com.ulacit.devappweb.dao.hibernate;

import org.appfuse.dao.hibernate.GenericDaoHibernate;
import org.springframework.stereotype.Repository;
import com.ulacit.devappweb.dao.OrdersDao;
import com.ulacit.devappweb.model.Orders;

@Repository("ordersDao")
public class OrdersDaoHibernate extends GenericDaoHibernate<Orders, Long> implements OrdersDao {
	
	public OrdersDaoHibernate() {
		super(Orders.class);
	}

}
