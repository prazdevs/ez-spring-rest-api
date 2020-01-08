package com.praz.ezrestapi.entity;

import javax.persistence.*;

@Entity
@Table(name = "student")
public class Student
{

    // Properties

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "first_name")
    private String firstName;
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Column(name = "last_name")
    private String lastName;
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // Constructors

    public Student() { }

    public Student(String firstName, String lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // Overrides

    @Override
    public String toString(){ return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + "]"; }


}
