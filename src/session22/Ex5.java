package session22;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Ex5 {

/*
Add a collection first 1_000_000 positive numbers and print elements which has odd index number in most performance way
 */

    public static void main(String[] args) {

        List<Integer> numbers=new LinkedList<>();

        for (int i = 0; i < 1_000_000; i++) {
            numbers.add(i+1);
        }

        List<Integer> newNumbers=new ArrayList<>(numbers);
        for (int i = 1; i <1_000_000 ; i+=2) {
            System.out.println(newNumbers.get(i));
        }









    }
}
