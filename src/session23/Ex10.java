package session23;

public class Ex10 {
//create a method which takes a string and returns the reversed version of string


    public static void main(String[] args) {

        System.out.println(reverse("yunus"));
        System.out.println(reverse2("yunus"));


    }


    public static String reverse(String str){
        return new StringBuilder(str).reverse().toString();
    }


    public static String reverse2(String str){
        String reversed="";
        for (int i = str.length()-1; i >= 0; i--) {
            reversed+=str.charAt(i);
        }
        return reversed;
    }






}
