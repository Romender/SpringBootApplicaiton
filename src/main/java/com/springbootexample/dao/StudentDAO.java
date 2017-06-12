package com.springbootexample.dao;

import com.springbootexample.entity.Student;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Ro8v1i0 on 6/11/17.
 */

public interface StudentDAO extends CrudRepository<Student,Integer> {

     Iterable<Student> findAll();

     Student findOne(Integer id);


}
