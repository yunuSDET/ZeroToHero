package session20.ex8Teacher;

import session19.ex4person.Person;

import java.lang.reflect.Parameter;
import java.time.LocalDate;
import java.time.Period;

public class Teacher {
    public String name,lastName;
    public char gender;
    public LocalDate dateOfBirth;
    public int age,id;


    public Teacher(String name, String lastName, char gender, LocalDate dateOfBirth, int id) {
        this.name = name;
        this.lastName = lastName;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.age = Period.between(dateOfBirth,LocalDate.now()).getYears();
        this.id = id;
    }


    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender=" + gender +
                ", dateOfBirth=" + dateOfBirth +
                ", age=" + age +
                ", id=" + id +
                '}';

    }
}


/*
Warm up Task:

     1. create a class named Teacher that has the followings features:
            Attributes:
                name,lastName, gender, dateOfBirth(use LocalDate), age, id

            Methods:

                sets all the attributes of the teacher object
                toString(): returns the full info of teacher Object


    2. create a class which is School with main method

    3. create a list of teacher in School class inside the STATIC BLOCK

    4. create a method in School class which is returning the list of teachers if the last name start with "M"

    5. create a method in School class then you will find the female teachers

    6. create a method in School class then find the teachers age smaller than 30

    7. create a methot in School class then find the teachers born in 1967 year
 */