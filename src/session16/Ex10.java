package session16;

import java.util.Scanner;

public class Ex10 {


    public static void main(String[] args) {
//Check if a given email address is valid or not. If it's valid,
// generate a password by concatenating the reversed username (before the '@' symbol)
// with the ASCII codes of each character of the email.
// If the email is not valid, ask for it to be inputted correctly again and again
        Scanner input=new Scanner(System.in);

        String email="";
        while (true){
            System.out.println("Enter a valid email");
            email=input.nextLine();
            boolean isValid=true;

            if(email.contains("@") && email.contains(".")){
                String beforeAt=email.substring(0,email.indexOf("@"));
                String betweenAtAndDot=email.substring(email.indexOf("@")+1,email.indexOf("."));
                String afterDot=email.substring(email.indexOf(".")+1);

                for (int i = 0; i < beforeAt.length(); i++) {
                    char ch=beforeAt.charAt(i);
                    if(!(Character.isLetterOrDigit(ch) || ch=='_')){

                        isValid=false;
                    }
                }

                for (int i = 0; i < betweenAtAndDot.length(); i++) {
                    char ch=betweenAtAndDot.charAt(i);
                    if(!(Character.isLetterOrDigit(ch) || ch=='_')){

                        isValid=false;
                    }
                }

                for (int i = 0; i < afterDot.length(); i++) {
                    char ch=afterDot.charAt(i);
                    if(!Character.isLetterOrDigit(ch)){

                        isValid=false;
                    }
                }

            }else{

                isValid=false;
            }

            if (isValid) break;
        }



        String beforeAt=email.substring(0,email.indexOf("@"));
        String asciiCodes="";
        for (int i = 0; i < email.length(); i++) {
            asciiCodes+=(int)email.charAt(i);
        }
        String password=(new StringBuilder(beforeAt).reverse().toString())+asciiCodes;
        System.out.println(password);

    }
}
