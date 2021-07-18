package com.springdatajpa.repository;

import com.springdatajpa.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface StudentRepository extends JpaRepository<Student, Integer> {
    Optional<Student> findStudentByEmail(String email);
    Student findStudentById(Integer id);
}
