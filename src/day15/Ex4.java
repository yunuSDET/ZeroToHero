package day15;

public class Ex4 {

    public static void main(String[] args) {

        //*Remove each uppercase letter which is next to another uppercase.
        //Input: WHAt is YOur naME?
        //Output:Wt is Yur naM?

    String text="WHAt is YOur naME?";

    String result="";

        for (int i = 0; i < text.length(); i++) {

          if(i>0 && Character.isUpperCase(text.charAt(i-1)) && Character.isUpperCase(text.charAt(i))){
                continue;
            }
            result+=text.charAt(i);

        }

        System.out.println(result);

    }
}
