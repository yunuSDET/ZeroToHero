package session20.ex4name;

public class Name {
    public String name,meaning;
    public char gender;

    public Name(String name, String meaning, char gender) {
        this.name = name;
        this.meaning = meaning;
        this.gender = gender;
    }


    @Override
    public String toString() {
        return "Name{" +
                "name='" + name + '\'' +
                ", meaning='" + meaning + '\'' +
                ", gender=" + gender +
                '}';
    }
}
