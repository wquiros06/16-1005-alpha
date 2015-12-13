package com.ulacit.devappweb.dao;

import static org.junit.Assert.*;

import java.util.List;

import org.appfuse.dao.BaseDaoTestCase;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;

import com.ulacit.devappweb.model.Employee;

public class EmployeeDaoTest extends BaseDaoTestCase {
	@Autowired
	private EmployeeDao employeeDao;

	@Test
	public void testFindByName() throws Exception {
		log.debug("testFindByName...");
		List<Employee> employees = employeeDao.findByName("Wen");
		assertTrue(employees.size() > 0);
	}

	@Test
	public void testFindByLastName() throws Exception {
		log.debug("testFindByLastName...");
		List<Employee> employees = employeeDao.findByLastName("Quiros");
		assertTrue(employees.size() > 0);
	}

	@Test
	public void testgetEmployees() throws Exception {
		log.debug("testgetEmployees...");
		List<Employee> employees = employeeDao.getAll();
		assertTrue(employees.size() > 0);
	}

	@Test(expected = DataAccessException.class)
	public void testAddAndRemoveEmployee() throws Exception {
		log.debug("Start add testAddAndRemoveEmployee ...");
		Employee employee = new Employee();
		employee.setName("Erick");
		employee.setLastName("Monge");
		employee.setIdentity("123456789");

		log.debug("saving employee ...");
		employee = employeeDao.save(employee);
		flush();

		employee = employeeDao.get(employee.getEmployeeId());

		assertEquals("Erick", employee.getName());
		assertNotNull(employee.getEmployeeId());

		log.debug("removing employee...");

		employeeDao.remove(employee.getEmployeeId());
		flush();

		// should throw DataAccessException
		employeeDao.get(employee.getEmployeeId());
	}

}
