package com.example.studentdemo.config;

import com.example.studentdemo.model.Student;
import com.example.studentdemo.repository.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student mert = new Student(
                    "Mert Cömertoğlu",
                    "mertycom@gmail.com",
                    LocalDate.of(1990, Month.JANUARY,31));

            Student sena = new Student(
                    "Sena Cömertoğlu",
                    "senacom@example.com",
                    LocalDate.of(1990, Month.OCTOBER,12));

            repository.saveAll(
                    List.of(mert,sena)
            );
        };
    }
}
