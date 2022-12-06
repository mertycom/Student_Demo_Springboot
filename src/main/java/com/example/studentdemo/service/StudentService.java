package com.example.studentdemo.service;

import com.example.studentdemo.model.Student;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {


    public List<Student> getStudents() {
        return List.of(new Student(1L,
                "Mert Cömertoğlu",
                "mertycom@gmail.com",
                32,
                LocalDate.of(1990, Month.JANUARY,31)));
    }
}
