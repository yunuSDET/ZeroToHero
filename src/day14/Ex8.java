package day14;

public class Ex8 {

    public static void main(String[] args) {
//*Remove all letters and spaces between any two numbers in a string
//Input
//Here is 1 there is 2 but only 4 is important.
//Output
//Here is 124 is important.


     String text="Here is 1 there is 2 but only 4 is important. 5 okay";

        String newText="";
        String[] parts=text.split("[0-9]");
        String lastPart=parts[parts.length-1];

        boolean isAdd=true;

        for (int i = 0; i <text.length() ; i++) {

            if(Character.isDigit(text.charAt(i))) {
                isAdd=true;
            }

           if(isAdd) newText+=text.charAt(i);

           if(Character.isDigit(text.charAt(i))) {
               isAdd=changeAdd(isAdd);
           }


        }
        newText+=lastPart;
        System.out.println(newText);


    }



    public static boolean changeAdd(boolean value){
        return !value;
    }

}
