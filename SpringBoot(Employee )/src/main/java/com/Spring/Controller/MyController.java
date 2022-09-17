 package com.Spring.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Spring.Entity.Employee;
import com.Spring.Service.EmpService;

@RestController
public class MyController {
	
	@Autowired
	private EmpService service; 

	@GetMapping("/employee")
	public List<Employee> getemplist()
	{
		return (List<Employee>) this.service.getemplist();
	
	}

	@PostMapping("/employee")
	public Employee postemplist(@RequestBody Employee employee)
	{
		return this.service.postemplist(employee);
	}
	@PutMapping("/employee")
	public Employee putemplist(@RequestBody Employee employee)
	{
		return this.service.putemplist(employee);
	}
	@DeleteMapping("/employee")
	public Employee Deletemplist(@RequestBody Employee employee)
	{
		return this.service.Deletemplist(employee);
	}
	
}
