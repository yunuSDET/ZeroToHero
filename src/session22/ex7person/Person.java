package session22.ex7person;
/*

/*
Create a class named Person with instance variables id,firstName,lastName and create a new class with a main method and create a map with Person object's id (key)
and Person objects(value). Add at least 5 person into map.

 */

public class Person {
    private Integer id;
    private String firstName;
    private String lastName;

    public Person(int id, String firstName, String lastName) {
        setId(id);
        setFirstName(firstName);
        setLastName(lastName);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        if(id<0) {
            throw new RuntimeException("Invalid Id");
        }
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if(firstName.isBlank()){
            throw new RuntimeException("Invalid first name");
        }
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if(lastName.isBlank()){
            throw new RuntimeException("Invalid last name");
        }
        this.lastName = lastName;
    }


    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }




}
