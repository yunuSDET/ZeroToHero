package day9;

public class Ex7 {

    public static void main(String[] args) {
        //*String scores = "1. score :34, 2. score :56, 3. score :81, 4. score :49"
        //Write a program to calculate the average of scores.
        // Your program must be flexible enough to calculate the average of any number of scores
        //Scores will be at the range of [10,99]
        String scores = "1. score :34, 2. score :679, 3. score :81, 4. score :49, 4. score :68";


        double sum=0;
        int counter=0;

        for (int i = 0; i <scores.length() ; i++) {
            char activeChar=scores.charAt(i);
            if(activeChar==':'){
                String num="";
                for (int j = i+1; j <scores.length() ; j++) {


                    if(','==scores.charAt(j)){
                        break;
                    }
                    num+=scores.charAt(j);
                }
                sum +=Integer.parseInt(num);
                counter++;
            }
        }
        System.out.println(sum/counter);

    System.out.println(scores.replaceAll("[0-9]+",""));


    }
}
