package com.vkakarla.springboot.jpa.crud.service;

import com.vkakarla.springboot.jpa.crud.entities.Employee;

public interface IEmployeeService {

	
	public void createEmployee(Employee employee);

	public Employee getEmployeeById(long id);

	public void updateEmployee(Employee employee);

	public void deleteEmployee(long id);


}
