package session12;

import java.util.Arrays;

public class Ex3 {

    public static void main(String[] args) {

//*Check if given words are anagram or not

        //First solution
        String text1 = "kasap";
        String text2 = "sapak";

        char[] text1Array = text1.toLowerCase().toCharArray(); //{k,a,s,a,p}
        char[] text2Array = text2.toLowerCase().toCharArray();//{s,a,p,a,k}

        Arrays.sort(text1Array); //{a,a,k,p,s}
        Arrays.sort(text2Array);//{a,a,k,p,s}

        if(Arrays.equals(text1Array,text2Array)){
            System.out.println(text1+" and "+ text2+" are anagram");
        }else{
            System.out.println(text1+" and "+ text2+" are not anagram");
        }


        //Second solution
        String sorted1="";
        String sorted2="";

            if(text1.length()==text2.length()){

                for (char j = 'a'; j <='z' ; j++) {

                     for (int i = 0; i <text1.length() ; i++) {

                        if(j==text1.charAt(i)) sorted1+=j;
                     }

                    for (int i = 0; i <text2.length() ; i++) {

                        if(j==text2.charAt(i)) sorted2+=j;
                    }
                }


            }else{
                System.out.println("The length of words is not equal");
                return;
            }


        if(sorted1.equals(sorted2)){
            System.out.println(text1+" and "+ text2+" are anagram");
        }else{
            System.out.println(text1+" and "+ text2+" are not anagram");
        }





    }
}
