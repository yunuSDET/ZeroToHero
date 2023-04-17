package session14;

public class Ex4 {

    public static void main(String[] args) {

//*Create a method which returns the index of an element in an array

    int[] array={3,5,67,78,8,57};

   int index= indexOfElement(array,5); //1

        System.out.println(index);




    }


    //Finds the index of given element
    public static int indexOfElement(int[] array,int element){
        int index=-1;

        for (int i = 0; i < array.length; i++) {
            if(array[i]==element){
                index=i;
                break;
            }
        }
        return index;

    }



}
