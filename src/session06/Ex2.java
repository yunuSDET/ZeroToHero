package session06;

public class Ex2 {

    public static void main(String[] args) {
//Using an if statement, find the number of digits in a given number between 1 and 1000.

      int number=245;

      String result="";

      if(number>=1 && number<=1000){

              if(number<=9){
                  result="1";
              }else if(number<=99){
                  result="2";
              }else if(number<=999){
                  result="3";
              }else{
                  result="4";
              }

      }else{

          result="invalid number";

      }

        System.out.println("The number of digits of "+number+" is "+result);


      //Second Solution
      int counter=0;
      while(number>0){
          counter++;
          number /=10;
      }
        System.out.println("counter2 = " + counter);



    }
}
