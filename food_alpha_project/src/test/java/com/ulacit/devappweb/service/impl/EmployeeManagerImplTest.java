package com.ulacit.devappweb.service.impl;

import static org.junit.Assert.assertSame;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.verify;

import java.util.ArrayList;
import java.util.List;

import org.appfuse.service.impl.BaseManagerMockTestCase;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import com.ulacit.devappweb.dao.EmployeeDao;
import com.ulacit.devappweb.model.Employee;

public class EmployeeManagerImplTest extends BaseManagerMockTestCase {

	@InjectMocks
	private EmployeeManagerImpl manager;

	@Mock
	private EmployeeDao dao;

	@Test
	public void testGetEmployee() {
		log.debug("testing get...");
		// given
		final Long id = 1L;
		final Employee employee = new Employee();
		given(dao.get(id)).willReturn(employee);

		// when
		Employee result = manager.get(id);

		// then
		assertSame(employee, result);
	}

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
	public void testSaveEmployee() {
		log.debug("testing save...");

		// given
		final Employee employee = new Employee();
		// enter all required fields

		given(dao.save(employee)).willReturn(employee);

		// when
		manager.save(employee);

		// then
		verify(dao).save(employee);
	}
}
