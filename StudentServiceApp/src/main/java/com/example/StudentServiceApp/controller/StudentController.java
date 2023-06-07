package com.example.StudentServiceApp.controller;


import com.example.StudentServiceApp.entity.Library;
import com.example.StudentServiceApp.entity.Student;
import com.example.StudentServiceApp.service.StudentService;
import com.example.StudentServiceApp.service.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RequestMapping("/student")
@RestController
public class StudentController {

    @Autowired
    private StudentServiceImpl studentService;

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable("id") int id){

        Library library=restTemplate.getForObject("http://localhost:8082/library/"+id, Library.class);

        Student s=studentService.getStudentById(id);
        s.setLibrary(library);
        return s;
    }

    @PostMapping("/")
    public Student insertStudent(@RequestBody Student student){
        Student s=studentService.insert(student);
        return  s;
    }
}
