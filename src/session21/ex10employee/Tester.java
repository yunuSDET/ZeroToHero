package session21.ex10employee;

public class Tester extends Employee{
    private String testingTool;


    public Tester(String firstName, String lastName, int age, double salary, String testingTool) {
        super(firstName, lastName, age, salary);
        this.testingTool = testingTool;
    }


    public String getTestingTool() {
        return testingTool;
    }

    public void setTestingTool(String testingTool) {
        this.testingTool = testingTool;
    }



    public void testing(){
        System.out.println(getFirstName()+" "+getLastName()+" is testing.");
    }




}
