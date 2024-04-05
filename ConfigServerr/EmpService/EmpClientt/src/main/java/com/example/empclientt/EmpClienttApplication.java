package com.example.empclientt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
@SpringBootApplication
@RestController
public class EmpClienttApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmpClienttApplication.class, args);
	}

	@Autowired
	@Lazy
	public RestTemplate restTemplate;
	
	@Value("${emp.service.url}")
	public String url;
	
	@Value("${welcome.message}")
    private String welcomeMessage;
	
	@GetMapping("/getEmpList")
	public List getEmpList() {
		return restTemplate.getForObject(url, List.class);
	}
	@GetMapping("/welcome")
    public String welcome() {
		 return welcomeMessage;
    }
	
	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}
}
