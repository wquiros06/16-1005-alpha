package com.ulacit.devappweb.dao.hibernate;

import org.appfuse.dao.hibernate.GenericDaoHibernate;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.ulacit.devappweb.dao.UserFoodDao;
import com.ulacit.devappweb.model.UserFood;

@Repository("userFoodDao")
public class UserFoodDaoHibernate extends GenericDaoHibernate<UserFood, Long> implements UserFoodDao {

	public UserFoodDaoHibernate() {
		super(UserFood.class);
	}

	@Override
	public UserFood findByUserName(String userName) {
		return (UserFood) getSession().createCriteria(UserFood.class).add(Restrictions.eq("userName", userName))
				.uniqueResult();
	}

}
