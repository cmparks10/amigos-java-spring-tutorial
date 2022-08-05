package com.example.demo.student;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;

@Service
public class StudentService {
    public Student getStudent(){
        return
                new Student(
                        1L,
                        "Corey",
                        "corey@gmailc.om",
                        LocalDate.of(1989, Month.MAY, 4),
                        33);

    }
}
