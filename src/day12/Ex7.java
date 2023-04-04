package day12;

import java.util.Arrays;

public class Ex7 {

    public static void main(String[] args) {
        String arrivals=
                        "1.    8.56 " +
                        "2.    8.58 " +
                        "3.    8.59 " +
                        "4.    9.00 " +
                        "5.    8.52 " +
                        "6.    8.59 " +
                        "7.    8.42 " +
                        "8.    8.41 " +
                        "10.   8.58 ";
        //*Given text shows 9 bus numbers and their arrival time.
        // Sort the buses with their arrival times and
        // print  the number of each bus and its arrival time.
        int numberOfBuses=9;

        int[] numbers=new int[numberOfBuses];
        double[] times=new double[numberOfBuses];


        int i=0;
        int firstIndex=0; //TODO 10 NUMARAYI 0 OLARAK GÖSTERİYOR
       while(arrivals.contains(".")) {

            int indexOfDot=arrivals.indexOf(".");


             numbers[i]=Integer.parseInt(arrivals.substring(indexOfDot-1,indexOfDot));



            arrivals=arrivals.substring(indexOfDot+1);

           indexOfDot=arrivals.indexOf(".");

             times[i]=Double.parseDouble(arrivals.substring(indexOfDot-1,indexOfDot+3));

           arrivals=arrivals.substring(indexOfDot+3);

            i++;

        }



        for (int j = 0; j <times.length ; j++) {
            for (int k = 0; k < times.length; k++) {
                if(times[j]<times[k]){
                    double tempDouble=times[j];
                    times[j]=times[k];
                    times[k]=tempDouble;

                    int tempInt=numbers[j];
                    numbers[j]=numbers[k];
                    numbers[k]=tempInt;
                }
            }
        }

        for (int j = 0; j <times.length ; j++) {
            System.out.println(numbers[j]+"  --->   "+times[j]);
        }





    }
}
