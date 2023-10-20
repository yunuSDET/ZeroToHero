package session07;

public class Ex5 {

    public static void main(String[] args) {
        //"Write a code that verifies if all  digits of a three-digit number are different."

        int number = 341;

        int ones = number % 10;
        int tens = (number / 10) % 10;
        int hundreds = number / 100;

        if (ones != tens && ones != hundreds && hundreds != tens) {
            System.out.println(number + "'s all digits are different.");
        } else {
            System.out.println(number + "'s some digits are same.");
        }


    }
}
