package session16;

public class Ex8 {


    public static void main(String[] args) {

//*Create a method which return the reversed version of given string

        System.out.println(reverse("selam"));




    }

public static String reverse(String word){
        return new StringBuilder(word).reverse().toString();
}



}
