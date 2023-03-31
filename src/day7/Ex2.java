package day7;

import java.sql.PreparedStatement;

public class Ex2 {

    public static void main(String[] args) {

//*Change a given string like this:
//Concat all numeric characters at the beginning and
// all other characters at the ending and print new string
//Example
//Input.     a45ge89tu
//Output   4589agetu

        String text="selam34nesılsın954guzel";

        String numerics=text.replaceAll("[^0-9]","");

        String others=text.replaceAll("[0-9]","");

        String result=numerics+others;

        System.out.println("Orijinal Text = " + text);
        System.out.println("Result          " + result);


    }
}
