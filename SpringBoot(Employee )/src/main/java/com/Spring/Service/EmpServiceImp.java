package com.Spring.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Spring.EmployeeDao.EmployeeDao;
import com.Spring.Entity.Employee;

@Service
public class EmpServiceImp implements EmpService {
	@Autowired
	private EmployeeDao dao;

	public EmpServiceImp() {

	}

	@Override
	public List<Employee> getemplist() {

		return dao.findAll();

	}

	@Override
	public Employee postemplist(Employee employee) {
		dao.save(employee);
		return employee;
	}

	@Override
	public Employee putemplist(Employee employee) {
		dao.save(employee);
		return employee;
	}

	@Override
	public Employee Deletemplist(Employee employee) {
		int i = employee.getId();
		dao.getReferenceById(i);
		dao.deleteById(i);
		return employee;
	}

}
