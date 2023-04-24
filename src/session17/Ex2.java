package session17;

public class Ex2 {

    public static void main(String[] args) {
        //*Create a method which returns the last index of an element in an array

        int[] myArray={2,4,5,6,7,2,78,8};

        System.out.println(lastIndexOf(myArray, 2));


    }

    public static int lastIndexOf(int[] array,int element){

        for (int i = array.length-1; i >= 0; i--) {
            if(element==array[i]){
                return i;
            }
        }
        return -1;

    }


}
