package session09;

public class Ex10 {

    public static void main(String[] args) {

        //*String ages="Yunus38,Aysel19,Mahmud32,Elif23";
        //write a program that outputs above string like example:
        //"Yunus is 38 years old."
        //"Aysel is 19 years old."
        //.
        //.
        //.


//        for (char i = '0'; i <='9' ; i++) {
//
//        }
        String ages="Yunus38,Aysel19,Mahmud32,Elif23";

        //First Solution
        String name="";
        String age="";
        for (int i = 0; i <ages.length() ; i++) {
            char activeChar=ages.charAt(i);
            if(Character.isAlphabetic(activeChar)){ //(activeChar>='a' && activeChar<='z') || (activeChar>='A' && activeChar<='Z')
                name+=activeChar;
            }else if(Character.isDigit(activeChar)){ //(activeChar>='0' && activeChar<='9')
                age+=activeChar;

            }
            if(activeChar==',' || i==ages.length()-1){
                System.out.println(name+" is "+age+" years old.");
                name="";
                age="";

            }
        }


        System.out.println("-".repeat(60));


        //Second solution
        String[] persons=ages.split(",");
        for (int i = 0; i <persons.length ; i++) {

            String name1=persons[i].replaceAll("[^a-zA-Z]","");
            String age1=persons[i].replaceAll("[^0-9]","");
            System.out.println(name1+" is "+age1+" years old.");
        }






    }
}
