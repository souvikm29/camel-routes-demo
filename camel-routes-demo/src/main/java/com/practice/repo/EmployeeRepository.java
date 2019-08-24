package com.practice.repo;

import org.springframework.stereotype.Repository;
import com.practice.entity.Employee;
import java.math.BigInteger;
import org.springframework.data.repository.CrudRepository;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, BigInteger> {

}
