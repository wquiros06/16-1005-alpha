package com.ulacit.devappweb.dao.hibernate;

import java.util.List;

import org.appfuse.dao.hibernate.GenericDaoHibernate;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.ulacit.devappweb.dao.OrderDao;
import com.ulacit.devappweb.model.Order;

@Repository("orderDao")
public class OderHibernate extends GenericDaoHibernate<Order, Long> implements OrderDao {

	public OderHibernate() {
		super(Order.class);
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<Order> findByDateOrder(String dateOrder) {
		return getSession().createCriteria(Order.class).add(Restrictions.eq("dateOrder", dateOrder)).list();
	}

}
