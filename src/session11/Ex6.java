package session11;

public class Ex6 {

    public static void main(String[] args) {

    //Convert all characters  except letters and
    // numbers from a string to spaces


        //First solution
        String text="Hi, my name is Yunus. What is your name? I am 38 years old.";
        String result="";
        for (int i = 0; i < text.length(); i++) {
            char ch=text.charAt(i);
            if((ch>='a' && ch<='z') ||(ch>='A' && ch<='Z') || (ch>='0' && ch<='9') ){
              result+=ch;
            }else{
                result+=" ";
            }
        }
        System.out.println(result);



        //Second solution
        System.out.println(text.replaceAll("[^0-9A-Za-z]", " "));







    }
}
