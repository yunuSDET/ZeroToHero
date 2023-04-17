package session10;

public class Ex3 {

    public static void main(String[] args) {
        //* add '*' character between each characters of a given string

        String text="hello";
        String newText="";

        for (int i = 0; i <text.length() ; i++) {
           if(i==text.length()-1) {
               newText+=text.charAt(i);
           }else{
               newText+=text.charAt(i)+"*";
           }
        }

        System.out.println("newText = " + newText);





        //Second solution
        String word="hello";
        word=word.replace("","*");
        word=word.substring(1,word.length()-1);
        System.out.println("word = " + word);


    }
}
