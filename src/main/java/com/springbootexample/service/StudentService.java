package com.springbootexample.service;

import com.springbootexample.dao.StudentDAO;
import com.springbootexample.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

/**
 * Created by Ro8v1i0 on 6/11/17.
 */
@Service
public class StudentService {

    @Autowired
    StudentDAO studentDAO;



    public void saveStudent(Student student) {
        studentDAO.save(student);
    }

    public Iterable<Student> getAllStudents(){
        return studentDAO.findAll();
    }

    public Student findOneStudent(Integer id) {
        return studentDAO.findOne(id);
    }
}
