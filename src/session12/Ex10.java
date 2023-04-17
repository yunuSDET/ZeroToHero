package session12;




public class Ex10 {


    public static void main(String[] args) {

        //*Print all chars except letters whose ascii codes is less then 100



        //First solution
        for (char i = 1; i <100 ; i++) {

            if (!((i>='a' && i<='z') || (i>='A' && i<='Z'))){
                System.out.print(i);
            }
        }





        //Second solution
        for (char i = 1; i <100 ; i++) {

            if (!Character.isAlphabetic(i)){
                System.out.print(i);
            }
        }




    }
}
