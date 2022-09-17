package com.Spring.EmployeeDao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Spring.Entity.Employee;

public interface EmployeeDao extends JpaRepository<Employee,Integer> {

}
