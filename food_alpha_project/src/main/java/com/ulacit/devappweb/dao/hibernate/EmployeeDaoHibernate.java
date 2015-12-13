package com.ulacit.devappweb.dao.hibernate;

import java.util.List;

import org.appfuse.dao.hibernate.GenericDaoHibernate;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.ulacit.devappweb.dao.EmployeeDao;
import com.ulacit.devappweb.model.Employee;

@Repository("employeeDao")
public class EmployeeDaoHibernate extends GenericDaoHibernate<Employee, Long> implements EmployeeDao {

	public EmployeeDaoHibernate() {
		super(Employee.class);
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<Employee> findByName(String name) {
		return getSession().createCriteria(Employee.class).add(Restrictions.eq("name", name)).list();
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<Employee> findByLastName(String lastName) {
		return getSession().createCriteria(Employee.class).add(Restrictions.eq("lastName", lastName)).list();
	}
}
