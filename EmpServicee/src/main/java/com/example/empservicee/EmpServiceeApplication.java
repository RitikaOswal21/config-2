package com.example.empservicee;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@SpringBootApplication
public class EmpServiceeApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmpServiceeApplication.class, args);
	}

	@GetMapping("/getEmpList")
	public List<String> getEmpList() {
		List<String> emp =  new ArrayList<>();
		emp.add("Java");
		emp.add("C");
		emp.add("C++");
		return emp;
	}

}
