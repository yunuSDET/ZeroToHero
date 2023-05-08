package session20.ex7employee;

public class Test {

    public static void main(String[] args) {

        WorkTeam workTeam=new WorkTeam("Yunus");
        workTeam.addEmployee("caglar","cag",'M',115000);
        workTeam.addEmployee("yusuf","yus",'M',85000);
        workTeam.addEmployee("burak","bu",'M',135000);
        workTeam.addEmployee("ayse","ay",'F',98000);
        workTeam.addEmployee("yunus","yun",'M',95000);

        //double average=workTeam.employeeArrayList.stream().map(i->i.salary).mapToDouble(Double::doubleValue).average().getAsDouble();

        double sum=0;
        for (Employee eachEmployee : workTeam.employeeArrayList) {
            sum+=eachEmployee.salary;
        }
        double average=sum/workTeam.employeeArrayList.size();
        System.out.println("average = " + average);



        System.out.println("Employees who have salaries less than 100000");
        workTeam.employeeArrayList.stream().filter(i->i.salary<100000).forEach(System.out::println);


        System.out.println("Male Employees");
        workTeam.employeeArrayList.stream().filter(i->i.gender=='M').forEach(System.out::println);


    }
}
