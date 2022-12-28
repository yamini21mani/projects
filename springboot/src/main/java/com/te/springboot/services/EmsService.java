package com.te.springboot.services;

import java.util.List;

import com.te.springboot.dto.EmployeeDto;
import com.te.springboot.entity.EmployeeEntity;


public interface EmsService {

	EmployeeEntity addemployee(EmployeeEntity employeeEntity);
	EmployeeEntity removeemployee(EmployeeEntity employeeEntity);
	boolean login(EmployeeDto dto);
	List<EmployeeEntity> seelist();
	boolean update(EmployeeDto dto);
}
