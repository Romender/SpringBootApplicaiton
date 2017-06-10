package com.springbootexample.controller;

import com.springbootexample.entity.Person;
import com.springbootexample.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;
import java.util.Collection;
import java.util.List;

/**
 * Created by Ro8v1i0 on 6/10/17.
 */
@RestController
@RequestMapping("/Person")
public class PersonController {

    @Autowired
    private PersonService personService;

    @RequestMapping(method = RequestMethod.GET)
    public Collection<Person> getAllPerson() {
        return personService.getAllPerson();
    }

    @RequestMapping(method=RequestMethod.GET,value = "/{id}")
    public Person getPerson(@PathVariable("id") Integer id) {
        return this.personService.getPerson(id);
    }

}
