package com.example.demo.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;

@RestController
@RequestMapping(path="api/v1/student")
public class StudentController {

    @GetMapping
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
