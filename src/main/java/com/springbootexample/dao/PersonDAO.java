package com.springbootexample.dao;

import com.springbootexample.entity.Person;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Ro8v1i0 on 6/10/17.
 */
@Repository
public class PersonDAO {

    static Map<Integer,Person> personRepository;

    static {
        personRepository = new HashMap<Integer,Person>();
        personRepository.put(1, new Person(1,"fistName","lastName"));
        personRepository.put(2,new Person(2,"Romender","Singh"));
        personRepository.put(3,new Person(3,"Sudhir","Kulay"));
    }

    public Collection<Person> getAllPerson() {
        return this.personRepository.values();
    }

    public Person getPerson(int i) {
        return personRepository.get(i);
    }
}
