package com.ulacit.devappweb.webapp.dao;

import java.util.List;

import org.appfuse.dao.BaseDaoTestCase;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;

import com.ulacit.devappweb.dao.EmployeeDao;
import com.ulacit.devappweb.model.Employee;

import static org.junit.Assert.*;

public class EmployeeDaoTest extends BaseDaoTestCase {
    @Autowired
    private EmployeeDao employeeDao;

    @Test
    public void testFindEmployeeByName() throws Exception {
        List<Employee> employees = employeeDao.findByName("Wen");
        assertTrue(employees.size() > 0);
    }
    
    @Test
    public void testFindEmployeeByLastName() throws Exception {
    	List<Employee> employees = employeeDao.findByLastName("Quiros");
        assertTrue(employees.size() > 0);
    }

    @Test(expected=DataAccessException.class)
    public void testAddAndRemovePerson() throws Exception {
        Employee employee = new Employee();
        employee.setName("Erick");
        employee.setLastName("Monge");

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
