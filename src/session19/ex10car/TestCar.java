package session19.ex10car;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;

public class TestCar {

    public static void main(String[] args) {

        Car car1=new Car("Tofaş",2005,150000,false);
        Car car2=new Car("Fiat",2017,250000,false);
        Car car3=new Car("Audi",2020,670000,false);
        Car car4=new Car("BMW",2012,834000,false);
        Car car5=new Car("Honda",2001,195000,false);
        Car car6=new Car("Nissan",2008,295000,false);

        ArrayList<Car> cars=new ArrayList<>(Arrays.asList(car1,car2,car3,car4,car5,car6));

        int currentYear= LocalDate.now().getYear();

        for (Car each : cars) {
            if(currentYear-each.year<10) each.start();
        }



        //System.out.println(cars);

        for (Car each : cars) {
            if(!each.isStarted) System.out.println(each);
        }


    }
}
