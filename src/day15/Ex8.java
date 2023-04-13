package day15;

import java.util.Arrays;

public class Ex8 {

    public static void main(String[] args) {

        //*Find how many elements in an array begin with a capital letter and continue with  lower case letters.

        String[] words={"Harun","Yesim","Ahmet","Bugra","KEMAL","ayten","GuLAY","AHSEN","Enes"};
        



       //First solution

        int count=0;
        for (String each : words) {
            if(each.matches("[A-Z][a-z]+")) count++;  //2
        }
        System.out.println(count);





        //Second solution

        System.out.println(Arrays.stream(words).filter(i -> i.matches("[A-Z][a-z]+")).count());  //1





        //Third solution
        int counter = 0;
        for (String name : words) {
            for (int i = 0; i < name.length(); i++) {
                if (name.charAt(i) >= 'A' && name.charAt(i) <= 'Z') {
                    if (name.substring(1).equals(name.substring(1).toLowerCase())) { //3
                        counter++;
                    }
                }
            }
        }

        System.out.println(counter);




    }
}
