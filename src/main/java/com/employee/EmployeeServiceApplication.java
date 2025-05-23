package com.employee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmployeeServiceApplication {

//	@Autowired
//	private EmployeeRepository employeeRepository;
//
//	@PostConstruct
//	public void initDB() {
//		employeeRepository.saveAll(Stream.of(new Employee(890,"peter","DEV"),new Employee(680,"sam","QA"),new Employee(235,"John","HR")).collect(Collectors.toList()));
//	}

	public static void main(String[] args) {
		SpringApplication.run(EmployeeServiceApplication.class, args);
	}

}
