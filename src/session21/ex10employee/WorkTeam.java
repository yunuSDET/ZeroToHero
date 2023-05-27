package session21.ex10employee;

import java.util.ArrayList;

public class WorkTeam {

    private ArrayList<Employee> employees;

    public WorkTeam() {
        this.employees = new ArrayList<>();
    }


    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public void addEmployee(Employee employee){
        employees.add(employee);
    }

    public void removeEmployee(String firstName,String lastName){
        employees.removeIf(i->i.getLastName().equalsIgnoreCase(lastName) && i.getFirstName().equalsIgnoreCase(firstName));

    }


    public void printEmployees(){
        for (Employee each : employees) {
            System.out.println(each);
        }
    }



}
