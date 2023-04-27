package session18;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex6 {

    public static void main(String[] args) {

// Take 10 numbers from the user and add them into an ArrayList then remove the numbers which has two digits.
//And find the average of remain elements

        Scanner input=new Scanner(System.in);


        ArrayList<Integer> numbers=new ArrayList<>();
        ArrayList<Integer> numbers2=new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int number=input.nextInt();
            numbers.add(number);
            numbers2.add(number);
        }

        //First solution
        numbers.removeIf(i->String.valueOf(i).length()==2);
        double average=0;
        double sum=0;
        for (Integer each : numbers) {
            sum+=each;
        }
        average=sum/numbers.size();
        System.out.println(average);


        //Second solution
        double average2=numbers2.stream()
                .filter(i->String.valueOf(i).length()!=2)
                .mapToInt(Integer::intValue)
                .average()
                .getAsDouble();
        System.out.println(average2);


    }

}
