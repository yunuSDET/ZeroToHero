package session19.ex9bird;

public class Bird {
    public String name;
    public boolean isFly;
    public int age;

    public Bird(String name, boolean isFly, int age) {
        this.name = name;
        this.isFly = isFly;
        this.age = age;
    }



    public String toString() {
        return "Bird{" +
                "name='" + name + '\'' +
                ", isFly=" + isFly +
                ", age=" + age +
                '}';
    }



}
