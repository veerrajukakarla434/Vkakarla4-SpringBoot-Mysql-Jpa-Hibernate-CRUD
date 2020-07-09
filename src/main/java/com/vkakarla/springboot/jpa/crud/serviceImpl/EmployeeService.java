package com.vkakarla.springboot.jpa.crud.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vkakarla.springboot.jpa.crud.entities.Employee;
import com.vkakarla.springboot.jpa.crud.repo.EmployeeRepository;
import com.vkakarla.springboot.jpa.crud.service.IEmployeeService;


@Service
public class EmployeeService implements IEmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;

	@Override
	public void createEmployee(Employee employee) {
		
		employeeRepository.save(employee);
	}
    
	@Override
	public Employee getEmployeeById(long id) {

		Employee employee = employeeRepository.getOne(id);
		return employee;
	}

	@Override
	public void updateEmployee(Employee employee) {

		employeeRepository.save(employee);
	}
    
	@Override
	public void deleteEmployee(long id) {
		
		employeeRepository.deleteById(id);
	}

}
