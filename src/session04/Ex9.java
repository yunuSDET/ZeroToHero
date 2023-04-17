package session04;

public class Ex9 {

    public static void main(String[] args) {
        //"Write a code that removes all digits in a given text."

        String text="fefe334345sfe";

      text=text.replace("0","")
              .replace("1","")
              .replace("2","")
              .replace("3","")
              .replace("4","")
              .replace("5","")
              .replace("6","")
              .replace("7","")
              .replace("8","")
              .replace("9","");

        System.out.println(text);


        //Second solution
        String text1="fefe334345sfe";
        text1=text1.replaceAll("[0-9]","");
        System.out.println(text1);




    }
}
