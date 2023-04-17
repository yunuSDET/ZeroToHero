package session05;

public class Ex7 {

    public static void main(String[] args) {
        //*Set a given sentence with writing only unique letters

        String sentence="Hi, my name is Yunus, what is your name?";
        String newSentence="";

        for (int i = 0; i <sentence.length() ; i++) {

                int count=0;

                char activeChar=sentence.charAt(i);

                for (int j = 0; j <sentence.length() ; j++) {

                    if(activeChar==sentence.charAt(j)) count++;

                }
                if(count==1) newSentence+=activeChar;


        }

        System.out.println(newSentence);



        //Second solution
      /*
       String[] chars= sentence.split("");
        Arrays.stream(chars).filter(i->sentence.replace(i,"").length()==1).forEach(System.out::println);
*/


    }
}
