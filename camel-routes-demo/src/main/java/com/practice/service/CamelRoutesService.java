package com.practice.service;

import java.math.BigInteger;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Component;

import com.practice.entity.Employee;

//@Service
@Component("camelRoutesService")
public interface CamelRoutesService{
	public void createUser(Employee employee) throws Exception;
	public Optional<Employee> findById(BigInteger empId) throws Exception;
	public List<Employee> getEmpList() throws Exception;
	public void testRoute();
}


