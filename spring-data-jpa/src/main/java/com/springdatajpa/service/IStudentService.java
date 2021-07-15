package com.springdatajpa.service;

import com.springdatajpa.entity.Student;

import java.util.List;

public interface IStudentService {
    void addStudent(Student student);
    List<Student> getAllStudent();
    void updateStudent(Student student);
    void deleteStudent(Integer id);
}
