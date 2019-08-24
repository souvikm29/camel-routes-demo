package com.practice.controller;

import java.math.BigInteger;
import java.util.Optional;

import org.apache.camel.ProducerTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.practice.entity.Employee;
import com.practice.service.CamelRoutesService;


@RestController
public class CamelRoutesController {

	@Autowired
	CamelRoutesService camelRoutesService;
	@Autowired
	ProducerTemplate producerTemplate;

	@GetMapping("/getEmployees/{empId}")
	public Employee getEmployeeById(@PathVariable("empId") BigInteger empId) throws Exception {
		Optional<Employee> emplOptional = camelRoutesService.findById(empId);
		System.out.println(emplOptional.get().getFirstName());
		return emplOptional.get();
	}
	
	@PostMapping("/saveEmployee")
	public void saveEmployee(@RequestBody Employee employee) throws Exception {
		System.out.println(employee.getEmpId());
		System.out.println(employee.getProjCode());
		camelRoutesService.createUser(employee);
	}
	
	@GetMapping("/call-routes")
	public void calRoutes() {
		producerTemplate.sendBody("direct:demo", "----------- Camel Routes Demo -------------");
	}
}
