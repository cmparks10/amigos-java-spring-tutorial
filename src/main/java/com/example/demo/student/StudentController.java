package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//Api/Controller Layer

@RestController
@RequestMapping(path="api/v1/student")
public class StudentController {

    private final StudentService studentService;

    @Autowired //dependency injection to inject the above Student Service into this method
    public StudentController(StudentService studentService) {

        this.studentService = studentService;
    }
    @GetMapping
    public Student getStudent(){

        return studentService.getStudent();
    }

}
