package day14;

public class Ex9 {

    public static void main(String[] args) {

/*

*Remove extra  spaces between words of a sentence
Input
Hi,      my   name     is yunus.
Output
Hi, my name is yunus.
*
 */



   //First solution
        String text="Hi,      my   name     is yunus.";
         String newText="";
        for (int i = 0; i < text.length()-1; i++) {
            if(text.charAt(i)==' ' && text.charAt(i+1)==' ') continue;
            newText+=text.charAt(i);
        }

        System.out.println(newText);


//Second solution
        String text2="Hi,      my   name     is yunus.";
        System.out.println(text2.replaceAll(" +", " "));


    }
}
