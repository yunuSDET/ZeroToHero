package session17;

public class Ex6 {

    public static void main(String[] args) {


        Runtime runtime=Runtime.getRuntime();
        //Testing  String concatenation and StringBuilder append

        long start1=runtime.freeMemory();
        method1();
       long first= start1-runtime.freeMemory();
        System.out.println(first);


        long start2=runtime.freeMemory();
        method2();
        long second=start2- runtime.freeMemory();
        System.out.println(second);


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
