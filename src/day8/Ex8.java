package day8;

public class Ex8 {

    public static void main(String[] args) {
  //*Remove all spaces at the beginning and at the ending of a given string.
  // If there are more than one space between words, decrease them to one space

      String text="   hi, my name           Yunus   ";

        text=text.trim();
        text=text.replaceAll(" +"," ");
        System.out.println(text);


        //Second solution
        String text2="   hi, my name           Yunus   ";
        text2=text2.trim();
        String newText2="";

       for (int i = 1; i <text2.length() ; i++) {
            char firstChar=text2.charAt(i-1);
            char secondChar=text2.charAt(i);

            if (i==1) {
                newText2+=firstChar;
            }

            if(!(firstChar==' ' && secondChar==' ')){
                newText2+=secondChar;
            }


        }



        System.out.println(newText2);


    }
}
