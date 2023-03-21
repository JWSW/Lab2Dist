package com.example.Payroll;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@EntityScan(basePackages = "com.example.Payroll.model")
public class PayrollApplication {

	public static void main(String... args)	 {
		SpringApplication.run(PayrollApplication.class, args);
	}

}
