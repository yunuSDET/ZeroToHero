package session07;

public class Ex1 {
   // *Print all three-digit numbers with 1,3,5,6,9,0 and
    // print how many numbers you printed


    public static void main(String[] args) {
        int[] numbers ={1,3,5,6,9,0};


        int counter=0;

        for (int i = 0; i <numbers.length-1 ; i++) {
            for (int j = 0; j <numbers.length ; j++) {
                for (int k = 0; k <numbers.length ; k++) {
                    System.out.println(numbers[i]*100+numbers[j]*10+numbers[k]);

                    counter++;

                }
            }
        }
        System.out.println("Result is = " + counter);


        //Second solution
        int count=0;
        for (int i = 100; i <=999 ; i++) {
            String actualNum=String.valueOf(i);
            if(actualNum.matches("[125690]+")) {
                count++;
            }
        }

        System.out.println("Result is " + count);


    }




}
