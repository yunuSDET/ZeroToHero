package session19.ex7student;
/*
*Create a class named Student
instances:firstName,lastName,id,gender
a contructor:sets all fields
actions:toString
Create a class named Classes
instances:students(arraylist of Students),className,teacherName
actions: toString, addStudent,removeStudent
Create a class named Test
Create a Classes object and add five students to the class object
Print the class object
 */
public class Student {
    public String firstName;
    public String lastName;
    public int id;
    public char gender;

    public Student(String firstName, String lastName, int id, char gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.gender = gender;
    }



    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", id=" + id +
                ", gender=" + gender +
                '}';
    }
}
