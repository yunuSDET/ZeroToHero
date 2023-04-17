package session08;

public class Ex2 {

    public static void main(String[] args) {

        //*Put "-" after each vowel which is before another vowel in a string

        String text="flnveoofbfeedadea";
        String newText="";
        String vowels="eaıioöuüAEIİOÖUÜ";
        String str1="";
        String str2="";
        for (int i = 0; i <text.length() -1; i++) {
            str1=""+text.charAt(i);
            str2=""+text.charAt(i+1);

            if(vowels.contains(str1) && vowels.contains(str2) ){
                newText+=str1+"-";
            }else{
                newText+=str1;
            }

        }
         newText+=str2;


        System.out.println(newText);

        //TODO yukarıdaki daha iyi hale getirilebilir






    }
}
