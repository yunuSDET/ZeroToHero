package session19.ex8dog;

public class Dog {

    public String name;
    public int age;
    public char gender;


    public Dog(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }


    public void bark(){
        System.out.println(name+" is barking.");
    }

    public void eat(){
        System.out.println(name+" is eating.");
    }


    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
