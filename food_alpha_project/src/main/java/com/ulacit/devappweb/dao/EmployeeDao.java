package com.ulacit.devappweb.dao;

import org.appfuse.dao.GenericDao;

import com.ulacit.devappweb.model.Employee;

import java.util.List;

public interface EmployeeDao extends GenericDao<Employee, Long> {
	public List<Employee> findByName(String name);
	public List<Employee> findByLastName(String lastName);
	public List<Employee> findByEmail(String email);
}
