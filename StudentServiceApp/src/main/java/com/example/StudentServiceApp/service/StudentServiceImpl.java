package com.example.StudentServiceApp.service;


import com.example.StudentServiceApp.entity.Student;
import com.example.StudentServiceApp.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Student getStudentById(int id) {
        return studentRepository.findById(id).get();
    }

    @Override
    public Student insert(Student student) {
        return studentRepository.save(student);
    }
}
