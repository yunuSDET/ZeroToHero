package session12;

import java.util.Arrays;

public class Ex9 {


    public static void main(String[] args) {

//*If you take any three digit number and find the difference of it and reversed of it.
// How many possible answer you can take

        int[] differences=new int[999];
        int index=0;

        for (int i = 100; i <=999 ; i++) {

            int number=i;

            int reverse=(i % 10)*100 +  (i/10 % 10)*10 + i/100;

            int difference=Math.abs(number-reverse);

            differences[index++]=difference;

        }

        int indexOfNewArray=0;
        int[] newArray=new int[differences.length];

        int temp=0;

        for (int i = 0; i <differences.length ; i++) {
            int counter=0;
            for (int j = i; j < differences.length; j++) {
                if(differences[i]==differences[j])   counter++;

            }
            if(counter==1) newArray[indexOfNewArray++]=differences[i];

        }

        newArray= Arrays.copyOfRange(newArray,0,indexOfNewArray);

        System.out.println(newArray.length);


    }
}
