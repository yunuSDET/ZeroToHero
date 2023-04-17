package session09;

public class Ex8 {

    public static void main(String[] args) {

//*write a program that counts the uppercase vowels of a given sentences


        String text = "Hi, my name is YUNUS, WHAT ARE YOU DOING?";
        String vowels = "AEIİOÖUÜ";
        int count = 0;

        //First solution
        for (int i = 0; i < text.length(); i++) {
            String activeCharacter = text.substring(i, i + 1);
            if (vowels.contains(activeCharacter)) {
                count++;
            }
        }
        System.out.println(count);



        //Second solution
        int counter = text.replaceAll("[^AEIİOÖUÜ]", "").length();
        System.out.println(counter);



    }

}
