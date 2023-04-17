package session09;

public class Ex4 {

    public static void main(String[] args) {
//Replace each digit in a string with the last digit of its result when multiplied by 7

        String text="fef34311 5667oop";
        String newText="";

        for (int i = 0; i <text.length() ; i++) {
            char ch=text.charAt(i);

            if(ch>='0' && ch<='9'){
                int digit=Integer.parseInt(""+ch);
                digit=(digit*7) % 10;
                newText+=digit;
            }else{
                newText+=ch;
            }
        }
        System.out.println(text);
        System.out.println(newText);





    }
}
