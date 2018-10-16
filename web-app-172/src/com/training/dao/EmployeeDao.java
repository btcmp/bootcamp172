package com.training.dao;

import java.util.List;

import com.training.model.Employee;

public interface EmployeeDao {

	public void save(Employee employee);
	public void update(int oldId, Employee employee);
	public void delete(Employee employee);
	public List<Employee> getAll();
	public Employee getEmployeeById(int id);
	
	
}
