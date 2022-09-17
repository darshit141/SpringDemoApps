package com.Spring.Service;

import java.util.List;

import com.Spring.Entity.Employee;
public interface EmpService {
	public List<Employee> getemplist();

	public Employee postemplist(Employee employee);
		
	public Employee putemplist(Employee employee);
	
	public Employee Deletemplist(Employee employee);


}

