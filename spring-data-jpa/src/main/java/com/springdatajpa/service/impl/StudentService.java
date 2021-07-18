package com.springdatajpa.service.impl;

import com.springdatajpa.entity.Student;
import com.springdatajpa.repository.StudentRepository;
import com.springdatajpa.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService implements IStudentService {

    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public void addStudent(Student student) {
        Optional<Student> studentByEmail = studentRepository.findStudentByEmail(student.getEmail());

        if(studentByEmail.isPresent()){
            throw new IllegalStateException("Email taken!!");
        }

        studentRepository.save(student);
    }

    @Override
    public List<Student> getAllStudent() {
        return studentRepository.findAll();
    }

    @Override
    public void updateStudent(Student student) {
        Student oldStudent = studentRepository.findStudentById(student.getId());

        if(oldStudent==null){
            throw  new IllegalStateException("Student does not exist");
        }
        else{
            oldStudent.setEmail(student.getEmail());
            oldStudent.setName(student.getName());
            oldStudent.setDob(student.getDob());
        }

        studentRepository.save(oldStudent);
    }

    @Override
    public void deleteStudent(Integer id) {
        Boolean exists = studentRepository.existsById(id);

        if(!exists){
            throw new IllegalStateException("Student does not exist");
        }

        studentRepository.deleteById(id);
    }
}
