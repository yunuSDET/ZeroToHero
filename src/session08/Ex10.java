package session08;

public class Ex10 {

    public static void main(String[] args) {

//*change all consonant letters to c and
//all vowel letters to v in a string which contains only letters.

        String text="my! name is v cYunus.";

        String vowel="aeıioöuü";
        String specialCharacters=",.! ?";
        String newtext="";

            for (int j = 0; j < text.length(); j++) {
                String activeCharacter=text.toLowerCase().substring(j,j+1);

                if(specialCharacters.contains(activeCharacter)) {
                    newtext+=activeCharacter;
                continue;
                }

                for (char i = 'a'; i <='z' ; i++) {

                    if(activeCharacter.equals(""+i) && vowel.contains(""+i)){
                        newtext+="v";
                        break;
                    }else if(activeCharacter.equals(""+i) ){
                        newtext+="c";
                        break;
                    }

                }

        }

        System.out.println(newtext);



        String text1="my! name is v cYunus.";
        System.out.println(text1);
        text1=text1.toLowerCase().replaceAll("[^aeıioöuü,.! ?]","c")
                .replaceAll("[aeıioöuü]","v");

        System.out.println(text1);


    }
}
