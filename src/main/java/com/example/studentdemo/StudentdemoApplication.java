package com.example.studentdemo;

import com.example.studentdemo.model.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@SpringBootApplication
public class StudentdemoApplication {

	public static void main(String[] args) {

		SpringApplication.run(StudentdemoApplication.class, args);
	}

}
