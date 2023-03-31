package day1;

public class Ex9 {

    public static void main(String[] args) {
//Print the odd numbers from an integer array;
int[] numbers={44,53,21,65,88,43,1};

        for (int i = 0; i <numbers.length ; i++) {
            if(numbers[i] % 2 !=0) System.out.println(numbers[i]);
        }


      //  Arrays.stream(numbers).filter(i->i % 2 !=0).forEach(System.out::println);


    }
}
