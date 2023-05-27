package session21.ex10employee;

public class Developer extends Employee{
    private String programmingLanguage;


    public Developer(String firstName, String lastName, int age, double salary, String programmingLanguage) {
        super(firstName, lastName, age, salary);
        this.programmingLanguage = programmingLanguage;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }


public void coding(){
    System.out.println(getFirstName()+" "+getLastName()+" is coding.");
}





}
