package day8;

public class Ex9 {

    public static void main(String[] args) {
        //*write a program which checks
        // if an eight character string's first two characters are number
        // and next two characters are lowercase letters
        // and next three characters are any number and last character is upparcase letter.

        String text="34km627Y";

        //First solution
        char firstChar=text.charAt(0);
        char secondChar=text.charAt(1);
        boolean firstCondition=false;
        if((firstChar>='1' && firstChar<='9') && (secondChar>='1' && secondChar<='9')){
            firstCondition=true;
        }


        char thirdChar=text.charAt(2);
        char fourthChar=text.charAt(3);
        boolean secondCondition=false;
        if((thirdChar>='a' && thirdChar<='z') && (fourthChar>='a' && fourthChar<='z')){
            secondCondition=true;
        }


        char fifthChar=text.charAt(4);
        char sixthChar=text.charAt(5);
        char seventhChar=text.charAt(6);
        boolean thirdCondition=false;
        if((fifthChar>='0' && fifthChar<='9') && (sixthChar>='0' && sixthChar<='9') && (seventhChar>='0' && seventhChar<='9')){
            thirdCondition=true;
        }

        char eighthChar=text.charAt(7);

        boolean fourthCondition=false;
        if((eighthChar>='A' && eighthChar<='Z') ){
            fourthCondition=true;
        }

        if(firstCondition && secondCondition && thirdCondition && fourthCondition){
            System.out.println(text+" is true");
        }else{
            System.out.println(text+" is false");
        }
        //TODO SONRA YUKARIDAKİ ÇÖZÜMÜ DAHA GÜZEL BİR ŞEKİLDE GÜNCELLE



        //Second solution
        System.out.println(text.matches("[0-9]{2}[a-z]{2}[0-9]{3}[A-Z]"));


    }
}
