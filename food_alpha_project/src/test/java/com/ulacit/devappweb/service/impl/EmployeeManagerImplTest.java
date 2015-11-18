package com.ulacit.devappweb.service.impl;

import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.mockito.BDDMockito.given;

import java.util.ArrayList;
import java.util.List;

import org.appfuse.service.impl.BaseManagerMockTestCase;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import com.ulacit.devappweb.dao.EmployeeDao;
import com.ulacit.devappweb.dto.EmployeeDTO;

public class EmployeeManagerImplTest extends BaseManagerMockTestCase {

	@InjectMocks
	private EmployeeManagerImpl manager;

	@Mock
	private EmployeeDao dao;
	
	@Test
	public void testGetEmployees() {
		log.debug("testing getAll...");
		// given
		final List employees = new ArrayList<>();
		given(dao.getAll()).willReturn(employees);

		// when
		List result = manager.getAll();

		// then
		assertSame(employees, result);
	}
	
	@Test
    public void testFindByName() throws Exception {
		final String name = "Mike";
        List<EmployeeDTO> employees = manager.findByName(name);
        assertTrue(employees.size() > 0);
    }
    
    @Test
    public void testFindByLastName() throws Exception {
    	final String lastName = "Guzman";
        List<EmployeeDTO> employees = manager.findByLastName(lastName);
        assertTrue(employees.size() > 0);
    }

}
