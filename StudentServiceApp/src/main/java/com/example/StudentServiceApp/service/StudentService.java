package com.example.StudentServiceApp.service;

import com.example.StudentServiceApp.entity.Student;

public interface StudentService {

    public Student getStudentById(int id);

    public Student insert(Student student);

}
