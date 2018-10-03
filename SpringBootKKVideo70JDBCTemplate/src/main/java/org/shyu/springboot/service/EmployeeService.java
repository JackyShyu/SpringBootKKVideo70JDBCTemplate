package org.shyu.springboot.service;

import org.shyu.springboot.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public class EmployeeService {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public void saveEmployee(Employee employee) {
		String sql = "Insert into employee set (employee_name, email, salary) values (?,?,?)";
		jdbcTemplate.update(sql, employee.getEmployeeName(), employee.getEmail(), employee.getSalary());
	}
}
