package com.springbootexample.entity;

/**
 * Created by Ro8v1i0 on 6/10/17.
 */
public class Person {


    private int id;
    private String firstName;
    private String lastName;

    public Person(){

    }

    public Person(int id,String firstName, String lastName) {
        this.id = id;
        this.firstName= firstName;
        this.lastName= lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        return id == person.id;


    }

    @Override
    public int hashCode() {
        return id;
    }
}
