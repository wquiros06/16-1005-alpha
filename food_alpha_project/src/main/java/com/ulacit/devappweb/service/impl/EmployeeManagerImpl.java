package com.ulacit.devappweb.service.impl;

import java.util.List;

import javax.jws.WebService;

import org.appfuse.service.impl.GenericManagerImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ulacit.devappweb.dao.EmployeeDao;
import com.ulacit.devappweb.dto.EmployeeDTO;
import com.ulacit.devappweb.mapper.EmployeeMapper;
import com.ulacit.devappweb.model.Employee;
import com.ulacit.devappweb.service.EmployeeManager;


@Transactional
@Service("employeeManager")
@WebService(serviceName = "EmployeeService", endpointInterface = "com.ulacit.devappweb.EmployeeManager")
public class EmployeeManagerImpl extends GenericManagerImpl<Employee, Long>implements EmployeeManager {
	EmployeeDao employeeDao;

	public EmployeeManagerImpl() {
	}

	@Autowired
	public EmployeeManagerImpl(EmployeeDao employeeDao) {
		super(employeeDao);
		this.employeeDao = employeeDao;
	}

	@Override
	public List<EmployeeDTO> getEmployees() {
		log.debug("STARTING getEmployees [EmployeeManagerImpl]...");
		List<EmployeeDTO> emloyeesDTOs = null;
		List<Employee> employees = employeeDao.getAll();
		
		
		emloyeesDTOs = EmployeeMapper.INSTANCE.employeesToEmployeesDTOs(employees);

		log.debug("[candidateDTOs]..." + emloyeesDTOs.size());
		
		return emloyeesDTOs;
	}

	@Override
	public List<EmployeeDTO> findByName(String name) {
		List<EmployeeDTO> employeesDTOs = null;
		List<Employee> employeesList = employeeDao.findByName(name);

		employeesDTOs = EmployeeMapper.INSTANCE.employeesToEmployeesDTOs(employeesList);

		return employeesDTOs;
	}

	@Override
	public List<EmployeeDTO> findByLastName(String lastName) {
		List<EmployeeDTO> employeesDTOs = null;
		List<Employee> employeesList = employeeDao.findByLastName(lastName);

		employeesDTOs = EmployeeMapper.INSTANCE.employeesToEmployeesDTOs(employeesList);

		return employeesDTOs;
	}

}
