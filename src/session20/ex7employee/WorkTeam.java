package session20.ex7employee;

import java.util.ArrayList;

public class WorkTeam {
    public ArrayList<Employee> employeeArrayList;
    public String theNameOfTeamLead;


    public WorkTeam(String theNameOfTeamLead) {
        this.theNameOfTeamLead = theNameOfTeamLead;
        employeeArrayList=new ArrayList<>();
    }

    public void addEmployee(String firstName,String lastName,char gender,double salary){

        employeeArrayList.add(new Employee(firstName,lastName,gender,salary));
    }

    public void removeEmployee(String firstName,String lastName){
        employeeArrayList.removeIf(i->i.firstName.equals(firstName) && i.lastName.equals(lastName));
    }


}
