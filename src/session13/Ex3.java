package session13;

public class Ex3 {

    public static void main(String[] args) {
        //*Find the longest of strings in an array

        String[] names={"yunus","burak","ayşe","ertuğrul","selim","hande","gülnur","sudenaz"};
        String longest=names[0];

        for (int i = 0; i < names.length; i++) {

            if(longest.length()<names[i].length()){
                longest=names[i];
            }

        }



        System.out.println(longest);


    }
}
