package session08;

public class Ex4 {

    public static void main(String[] args) {
        //*write a program which counts "k" letters in a string with using .split()

        String text="ahramkankelebek ";

       int count=0;

       if(text.charAt(text.length()-1)=='k'){
           count=text.split("k").length;
       }else{
           count=text.split("k").length-1;
       }

        System.out.println(count);


    }
}
