package session21.ex10employee;

public class Test {


    public static void main(String[] args) {

        WorkTeam workTeam = new WorkTeam();

        workTeam.addEmployee(new Developer("yunus","k",39,110000,"Java"));
        workTeam.addEmployee(new Developer("burak","y",36,105000,"Python"));
        workTeam.addEmployee(new Tester("caglar","c",32,84000,"Selenium"));
        workTeam.addEmployee(new Tester("kubra","t",28,90000,"Cucumber"));



        System.out.println("Increase all salaries with 15000 and print employees");
        for (Employee eachEmployee : workTeam.getEmployees()) {
            eachEmployee.setSalary(eachEmployee.getSalary()+15000);
        }

        workTeam.printEmployees();



        System.out.println("Print all employees whose salary is less than 120000");
        for (Employee eachEmployee : workTeam.getEmployees()) {
            if(eachEmployee.getSalary()<120000) System.out.println(eachEmployee);
        }



        System.out.println("Print testers");
        for (Employee eachEmployee : workTeam.getEmployees()) {
            if(eachEmployee instanceof Tester) System.out.println(eachEmployee);
        }



        System.out.println("Print developers");
        for (Employee eachEmployee : workTeam.getEmployees()) {
            if(eachEmployee instanceof Developer) System.out.println(eachEmployee);
        }



        System.out.println("Print all employees Who is older than 35");
        for (Employee eachEmployee : workTeam.getEmployees()) {
            if(eachEmployee.getAge()>35) System.out.println(eachEmployee);
        }



        System.out.println("Call testing method for all Tester objects");
        for (Employee eachEmployee : workTeam.getEmployees()) {
            if(eachEmployee instanceof Tester) {

                ((Tester) eachEmployee).testing();

            }
        }



        System.out.println("Call coding method for all Developer objects");
        for (Employee eachEmployee : workTeam.getEmployees()) {
            if(eachEmployee instanceof Developer) {
                ((Developer) eachEmployee).coding();
            }
        }




    }
}
