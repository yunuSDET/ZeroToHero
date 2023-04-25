package session17;

public class Ex6 {

    public static void main(String[] args) {


        Runtime runtime=Runtime.getRuntime();

        //Testing  String concatenation and StringBuilder append

        //method1(); //2982440
        method2();   //2394504
       long first= runtime.totalMemory()- runtime.freeMemory();
        System.out.println(first);




    }

    public static void method1(){
        String string="";
        for (int i = 0; i <1000 ; i++) {
            string+="a";
        }
    }

    public static void method2(){
        StringBuilder stringBuilder=new StringBuilder();
        for (int i = 0; i <1000 ; i++) {
            stringBuilder.append("a");
        }

    }

}
