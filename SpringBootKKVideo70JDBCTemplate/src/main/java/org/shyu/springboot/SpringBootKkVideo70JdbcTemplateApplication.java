package org.shyu.springboot;

import org.shyu.springboot.model.Employee;
import org.shyu.springboot.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootKkVideo70JdbcTemplateApplication implements CommandLineRunner {

	@Autowired
	private EmployeeService employeeService;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootKkVideo70JdbcTemplateApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Employee employee = new Employee("Mark", "mark@gmail.com", 3000);
		employeeService.saveEmployee(employee);
	}
}
