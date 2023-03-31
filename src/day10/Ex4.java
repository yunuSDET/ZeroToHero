package day10;

public class Ex4 {

    public static void main(String[] args) {

        //print all five-digit numbers which do not contain the number of 9


        int count=0;
        for (int i = 10000; i <=99999 ; i++) {
            String number=Integer.toString(i);

                if(!number.contains("9")){
                    count++;
                    System.out.println(i);
                }
        }

        System.out.println("count = " + count);






        //Second solution
        int blocked=9;
        int counter=0;
        for (int i = 1; i <=9 ; i++) {
            for (int j = 0; j <=9 ; j++) {
                for (int k = 0; k <=9 ; k++) {
                    for (int l = 0; l <=9 ; l++) {
                        for (int m = 0; m <=9 ; m++) {
                            if(!(blocked==i || blocked==j || blocked==k || blocked==l || blocked==m)){
                                int number=i*100000+j*1000+k*100+l*10+m;
                                System.out.println("number = " + number);
                                counter++;
                            }


                        }
                    }

                }
            }
        }


        System.out.println("counter = " + counter);


    }
}
