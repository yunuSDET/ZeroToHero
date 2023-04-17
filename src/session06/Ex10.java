package session06;

public class Ex10 {

    public static void main(String[] args) {
  //*Find the number of the words of a given sentences


  String sentence="Hi friends, how are you today?";

        int spaces=0;

        for (int i = 0; i <sentence.length() ; i++) {
            if(sentence.substring(i,i+1).equals(" ")){
                spaces++;
            }
        }


        System.out.println("Words = " + (spaces+1));

        System.out.println(sentence.split(" ").length);




    }
}
