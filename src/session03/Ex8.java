package session03;

public class Ex8 {

    public static void main(String[] args) {
//Write a program that finds the smallest of three numbers.

      int n1=34;
      int n2=53;
      int n3=532;

      int smallest=n1;

      if(smallest>n2){
          smallest=n2;
      }
      if(smallest>n3){
          smallest=n3;
      }
        System.out.println("smallest = " + smallest);


    }
}
