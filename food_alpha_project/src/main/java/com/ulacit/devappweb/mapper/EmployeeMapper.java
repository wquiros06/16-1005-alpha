package com.ulacit.devappweb.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

import com.ulacit.devappweb.dto.EmployeeDTO;
import com.ulacit.devappweb.model.Employee;

@Mapper
public interface EmployeeMapper {

	EmployeeMapper INSTANCE = Mappers.getMapper(EmployeeMapper.class);

	List<EmployeeDTO> employeesToEmployeesDTOs(List<Employee> employees);

	@Mappings({ 
			@Mapping(source = "employeeId", target = "employeeId"),
			@Mapping(source = "identity", target = "identity"), 
			@Mapping(source = "name", target = "name"),
			@Mapping(source = "lastName", target = "lastName"),
			@Mapping(source = "employeeContact", target = "employeeContact"),
			@Mapping(source = "employeeOrder", target = "employeeOrder")			
			})
	EmployeeDTO employeeToEmployeeDTO(Employee employee);
}
