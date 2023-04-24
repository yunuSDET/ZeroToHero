package session17;

public class Ex1 {

    public static void main(String[] args) {
        //*Create a method which returns the reversed version of given string
       // Runtime runtime=Runtime.getRuntime();
       // runtime.freeMemory()


        String text="hello";
        System.out.println(reverse(text));



    }

    //First method
    public static String reverse(String word){
        String reversed="";
        for (int i = word.length()-1; i >= 0; i--) {
            reversed+=word.charAt(i);
        }
        return reversed;
    }


    //Second method
    public static String reverse2(String word){
        return (new StringBuilder(word).reverse()).toString();
    }



}
