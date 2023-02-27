package com.hemant.springboot;

import com.hemant.springboot.stream.Employee;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class SpringbootApplication {

	public static void main(String[] args) {
		//SpringApplication.run(SpringbootApplication.class, args);
		List<Employee> employeeList = new ArrayList<>();

		employeeList.add(new Employee("hemant", 1L, 1000L, List.of("Java","Oracle")));
		employeeList.add(new Employee("arpit",2L, 2000L, List.of("python", "mongo")));
		employeeList.add(new Employee("prateek",3L, 3000L, List.of("dot net", "mysql")));

		employeeList
				.stream()
				.filter(employee -> employee.getSkills().contains("Java"))
				.forEach(employee -> System.out.println("name: " + employee.getName() + " ----salary" + employee.getSalary()));
	}


}
