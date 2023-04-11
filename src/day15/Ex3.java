package day15;

public class Ex3 {

    public static void main(String[] args) {
//*write a program which takes a number (written with letters) up to 100 as a parameter and return the value of given number
//Input sixty four
//Output 64
        System.out.println(getNumbers("fifty-nine"));

    }

    public static int getNumbers(String number) {

        String[] numbers = number.split("-");
        if (numbers.length > 2) {
            System.out.println("Invalid number");
            System.exit(0);
        }
        int result = 0;

        if (numbers.length == 1) {

            result=getDigitOrDigits(numbers[0]);

        } else {
            result=getDigitOrDigits(numbers[0]);

            result+=getDigitOrDigits( numbers[1]);

        }


        return result;
    }

    public static int getDigitOrDigits(String digit) {
        int result = 0;

        switch (digit) {
            case "one":
                result = 1;
                break;
            case "two":
                result = 2;
                break;
            case "three":
                result = 3;
                break;
            case "four":
                result = 4;
                break;
            case "five":
                result = 5;
                break;
            case "six":
                result = 6;
                break;
            case "seven":
                result = 7;
                break;
            case "eight":
                result = 8;
                break;
            case "nine":
                result = 9;
                break;
            case "zero":
                result = 0;
                break;
            case "eleven":
                result = 11;
                break;
            case "twelve":
                result = 12;
                break;
            case "thirteen":
                result = 13;
                break;
            case "fourteen":
                result = 14;
                break;
            case "fifteen":
                result = 15;
                break;
            case "sixteen":
                result = 16;
                break;
            case "seventeen":
                result = 17;
                break;
            case "eighteen":
                result = 18;
                break;
            case "nineteen":
                result = 19;
                break;
            case "twenty":
                result = 20;
                break;
            case "thirty":
                result = 30;
                break;
            case "forty":
                result = 40;
                break;
            case "fifty":
                result = 50;
                break;
            case "sixty":
                result = 60;
                break;
            case "seventy":
                result = 70;
                break;
            case "eighty":
                result = 80;
                break;
            case "ninety":
                result = 90;
                break;
            default:
                System.out.println("Invalid number");

        }
        return result;
    }
}