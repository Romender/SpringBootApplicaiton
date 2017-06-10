package com.springbootexample.service;

import com.springbootexample.dao.PersonDAO;
import com.springbootexample.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

/**
 * Created by Ro8v1i0 on 6/10/17.
 */

@Service
public class PersonService {

    @Autowired
    private PersonDAO personDao;

    public Collection<Person> getAllPerson(){
        return this.personDao.getAllPerson();
    }

    public Person getPerson(Integer id) {
        return this.personDao.getPerson(id);
    }

}
