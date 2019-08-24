package com.practice.service.impl;

import java.math.BigInteger;
import java.util.List;
import java.util.Optional;

import org.springframework.transaction.annotation.Transactional;

import com.practice.entity.Employee;
import com.practice.repo.EmployeeRepository;
import com.practice.service.CamelRoutesService;

@Transactional
public class CamelRoutesServiceImpl implements CamelRoutesService {

	private final EmployeeRepository employeeRepository;

	public CamelRoutesServiceImpl(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}

	@Override
	public void createUser(Employee employee) throws Exception {
		employeeRepository.save(employee);
	}

	@Override
	public Optional<Employee> findById(BigInteger empId) throws Exception {
		return employeeRepository.findById(empId);
	}

	@Override
	public List<Employee> getEmpList() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void testRoute() {
		System.out.println("----- Test route called -----");

	}

}
