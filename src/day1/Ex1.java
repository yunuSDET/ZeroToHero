package day1;

public class Ex1 {

    public static void main(String[] args) {
// find the count of digits of the number


int number = 24581;
int temp=number;
int counter=0;

while (temp>0){
    counter++;
    temp/=10;
}
        System.out.println(number+ " has " + counter+" digits.");


    }
}
