package session09;

public class Ex3 {

    public static void main(String[] args) {
        //*write a program which counts the even digits of a string

        //First solution
        String text="abc342567kl3320m";
        String evenNumbers="02468";
        int counter=0;

        for (int i = 0; i < text.length(); i++) {
            String activeCharacter=text.substring(i,i+1);
            if(evenNumbers.contains(activeCharacter)){
                counter++;

            }
        }

        System.out.println(counter);


        //Second solution
        System.out.println(text.replaceAll("[^02468]", "").length());

    }
}
