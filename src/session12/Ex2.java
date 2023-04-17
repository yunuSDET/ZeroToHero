package session12;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex2 {

    public static void main(String[] args) {
        //String text="31. Hafta 02 Mayıs 2022 - 06 Mayıs 2022
        //M.2.3.2.1. Kuruş ve lira arasındaki ilişkiyi fark eder.(2s)
        //M.2.3.2.2. Değeri 100 lirayı geçmeyecek biçimde farklı miktarlardaki paraları karşılaştırır(2s)
        //M.2.3.2.3. Paralarımızla ilgili problemleri çözer.(1s)"
        //
        //write a program which lists the special codes from the text like example output
        //M.2.3.2.1.
        //M.2.3.2.2.
        //M.2.3.2.3.

        String text="31. Hafta 02 Mayıs 2022 - 06 Mayıs 2022 M.2.3.2.1. " +
                "Kuruş ve lira arasındaki ilişkiyi fark eder.(2s) M.2.3.2.2. " +
                "Değeri 100 lirayı geçmeyecek biçimde farklı miktarlardaki paraları karşılaştırır(2s) " +
                "M.2.3.2.3. Paralarımızla ilgili problemleri çözer.(1s)";


        String regex="[A-Z]\\.[0-9]+\\.[0-9]+\\.[0-9]+\\.[0-9]+\\.";
        String[] others=text.split(regex);  //everything separated by regex
        for (String other : others) {
            text= text.replace(other,"-");

        }

        String[] codes=text.split("-");
        for (String code : codes) {
            if(code.length()>0) System.out.println(code);
        }


//Second solution
        String str="31. Hafta 02 Mayıs 2022 - 06 Mayıs 2022 M.2.3.2.1. " +
                "Kuruş ve lira arasındaki ilişkiyi fark eder.(2s) M.2.3.2.2. " +
                "Değeri 100 lirayı geçmeyecek biçimde farklı miktarlardaki paraları karşılaştırır(2s) " +
                "M.2.3.2.3. Paralarımızla ilgili problemleri çözer.(1s)";


        for (int i = 0; i <str.length()-2 ; i++) {
            char activeChar=str.charAt(i);
            char next1Char=str.charAt(i+1);
            char next2Char=str.charAt(i+2);
            String result="";
            if((activeChar>='A' && activeChar<='Z') && next1Char=='.' && (next2Char>='0' && next2Char<='9')){
                //we checked if there is a sub string starting with UppercaseLetter+.+NumericValue
                int dotCounter=0;
                int lastJ=0;
                for (int j = i; j <str.length() ; j++) {
                    result+=str.charAt(j);
                    if(str.charAt(j)=='.') dotCounter++;
                    lastJ=j;
                    if(dotCounter==5) break;
                }

                System.out.println(result);
                i=lastJ;

            }
        }


//Third solution
        System.out.println("-".repeat(100));
        String str2="31. Hafta 02 Mayıs 2022 - 06 Mayıs 2022 M.2.3.2.1. " +
                "Kuruş ve lira arasındaki ilişkiyi fark eder.(2s) M.2.3.2.2. " +
                "Değeri 100 lirayı geçmeyecek biçimde farklı miktarlardaki paraları karşılaştırır(2s) " +
                "M.2.3.2.3. Paralarımızla ilgili problemleri çözer.(1s)";


        String regex1="[A-Z]\\.[0-9]+\\.[0-9]+\\.[0-9]+\\.[0-9]+\\.";

        Pattern pattern=Pattern.compile(regex1);
        Matcher matcher= pattern.matcher(str2);
        while (matcher.find()){
            System.out.println(matcher.group());
        }



    }
}
