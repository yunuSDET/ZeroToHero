package session19.ex6calculator;

import javax.swing.plaf.PanelUI;

/*
*Create a class named Calculator
Attributes:
               instance : number1, number2
Add a constructor that can set the two instances
Actions:
              methods:addition,subtraction,multiplication,division,toString (shows numbers and the results of other methods)
Create TestCalculator class with a main method and Create an object of Calculator and print object
 */
public class Calculator {
    public int number1,number2;

    public Calculator(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public int addition(int number1,int number2){
        return number1+number2;
    }

    public int subtraction(int number1,int number2){
        return number1-number2;
    }

    public int multiplication(int number1,int number2){
        return number1*number2;
    }

    public int division(int number1,int number2){
        return number1/number2;
    }


    public String toString() {
        return "Calculator{" +
                "number1=" + number1 +
                ", number2=" + number2 +
                ", addition=" + addition(number1,number2) +
                ", subtraction=" + subtraction(number1,number2) +
                ", multiplication=" + multiplication(number1,number2) +
                ", division=" + division(number1,number2) +
                '}';
    }
}
