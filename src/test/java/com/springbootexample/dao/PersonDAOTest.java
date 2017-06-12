package com.springbootexample.dao;

import com.springbootexample.entity.Person;
import junit.framework.TestCase;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Collection;

/**
 * Created by Ro8v1i0 on 6/11/17.
 */
public class PersonDAOTest {

    @Autowired
    private PersonDAO personDAO;


    private void testGetAllPerson(){
        Collection<Person> coll = personDAO.getAllPerson();
        TestCase.assertNull(coll);

    }
}
