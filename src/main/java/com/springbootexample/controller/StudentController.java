package com.springbootexample.controller;

import com.springbootexample.dao.StudentDAO;
import com.springbootexample.entity.Student;
import com.springbootexample.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.MimeType;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

/**
 * Created by Ro8v1i0 on 6/11/17.
 */
@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping(method = RequestMethod.GET)
    public Iterable<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    @RequestMapping(method=RequestMethod.GET,value="/{id}")
    public Student getStudent(@PathVariable("id") int id) {
        return studentService.findOneStudent(id);
    }

    @RequestMapping(method=RequestMethod.POST,consumes = "application/json")
    public void createStudent(@RequestBody Student student){
        studentService.saveStudent(student);

    }
}
