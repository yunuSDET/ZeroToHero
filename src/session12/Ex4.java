package session12;

public class Ex4 {

    public static void main(String[] args) {


        String[] names={"yunus","burak","çağlar"};

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }


        for (String each : names) {
            System.out.println(each);
        }

        int[] numbers={3,5,65,34,23};

        for (int eachNumber : numbers) {
            System.out.println(eachNumber);
        }

    }
}
