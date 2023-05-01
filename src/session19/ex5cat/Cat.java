package session19.ex5cat;

/*Create a class named Cat
 instances:name,age,gender
 a constructor:sets all fields
 actions:eat,sleep,play,toString
 Create a TestCat class
 Create 6 cat objects and add them into an arraylist

 print the cats which are younger than 5 and male
 */
public class Cat {
    public String name;
    public int age;
    public char gender;

    public Cat(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }


   public void eat(){
       System.out.println(name+" is eating.");
   }

    public void sleep(){
        System.out.println(name+" is sleeping.");
    }

    public void play(){
        System.out.println(name+" is playing.");
    }


    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
