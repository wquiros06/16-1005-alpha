package com.ulacit.devappweb.dao;

import java.util.List;

import org.appfuse.dao.BaseDaoTestCase;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;

import com.ulacit.devappweb.model.Employee;
import static org.junit.Assert.*;


public class EmployeeDaoTest extends BaseDaoTestCase {
    @Autowired
    private EmployeeDao employeeDao;

    @Test
    public void testFindByName() throws Exception {
        List<Employee> employees = employeeDao.findByName("Wen");
        assertTrue(employees.size() > 0);
    }
    
    @Test
    public void testFindByLastName() throws Exception {
    	List<Employee> employees = employeeDao.findByLastName("Quiros");
        assertTrue(employees.size() > 0);
    }

    @Test
    public void testgetCandidates() throws Exception {
        List<Employee> employees = employeeDao.getAll();
        assertTrue(employees.size() > 0);
    }
    
    
    @Test(expected=DataAccessException.class)
    public void testAddAndRemoveEmployee() throws Exception {
        Employee employee = new Employee();
        employee.setName("Erick");
        employee.setLastName("Monge");

        employee = employeeDao.save(employee);
        flush();

        employee = employeeDao.get(employee.getEmployeeId());

        assertEquals("Country", employee.getEmployeeId());
        assertNotNull(employee.getEmployeeId());

        log.debug("removing employee...");

        employeeDao.remove(employee.getEmployeeId());
        flush();

        // should throw DataAccessException
        employeeDao.get(employee.getEmployeeId());
    }
    
}
