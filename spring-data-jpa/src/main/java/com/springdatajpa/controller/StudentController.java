package com.springdatajpa.controller;

import com.springdatajpa.entity.Student;
import com.springdatajpa.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;

@RestController
@RequestMapping(path = "student")
public class StudentController {

    private final IStudentService studentService;

    @Autowired
    public StudentController(IStudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping(path = "getAll")
    public List<Student> getAllStudent(){
        return studentService.getAllStudent();
    }

    @PostMapping(path = "/")
    public void addStudent(@RequestBody Student student){
        studentService.addStudent(student);
    }

    @PutMapping(path = "/")
    @Transactional
    public void updateStudent(@RequestBody Student student){
        studentService.updateStudent(student);
    }

    @DeleteMapping(path = "{studentId}")
    public void deleteStudent(@PathVariable("studentId") Integer id){
        studentService.deleteStudent(id);
    }
}
