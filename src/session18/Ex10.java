package session18;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Ex10 {


    public static void main(String[] args) {
//*Add all numbers from 1 to 100 into
// an ArrayList and remove if any element is divisible by 5 but not 9, and even

        //First solution
        ArrayList<Integer> numbers=new ArrayList<>();
        for (int i = 1; i <=100 ; i++) {
            numbers.add(i);
        }
        numbers.removeIf(i->i % 5==0 && i % 9 !=0 && i % 2 ==0);
        System.out.println(numbers);


        //Second solution
        List<Integer> numbers2=IntStream.rangeClosed(1,100)
                .filter(i->!(i % 5==0 && i % 9 !=0 && i % 2 ==0))
                .boxed()
                        .collect(Collectors.toList());
        System.out.println(numbers2);




    }
}
