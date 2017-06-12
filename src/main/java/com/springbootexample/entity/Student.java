package com.springbootexample.entity;


import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by Ro8v1i0 on 6/10/17.
 */
@Entity

public class Student {

    @Id
    private int id;

    private String firstName;

    private String lastName;

    private String fullName;

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

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
}
