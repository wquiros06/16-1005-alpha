/**
 * @author Desarrollo
 *
 */
package com.ulacit.devappweb.dao.hibernate;

import java.util.List;

import org.appfuse.dao.hibernate.GenericDaoHibernate;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.ulacit.devappweb.dao.DishIngredientDao;
import com.ulacit.devappweb.model.DishIngredient; 

@Repository("dishIngredientDao")
public class DishIngredientDaoHibernate extends GenericDaoHibernate<DishIngredient, Long> implements DishIngredientDao {

	public DishIngredientDaoHibernate() {
		super(DishIngredient.class);
	}
	
	@SuppressWarnings("unchecked")
	public List<DishIngredient> findByDishId(Long dishId) {
		return getSession().createCriteria(DishIngredient.class).add(Restrictions.eq("dishId", dishId)).list();
	}

}
