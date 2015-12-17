package com.ulacit.devappweb.dao;

import org.appfuse.dao.GenericDao;

import com.ulacit.devappweb.model.Employee;

import java.util.List;

public interface EmployeeDao extends GenericDao<Employee, Long> {
	/**
	 * @param name
	 * @return a list of employees 
	 */
	public List<Employee> findByName(String name);
	/**
	 * @param lastName
	 * @return a list of employees
	 */
	public List<Employee> findByLastName(String lastName);
}
