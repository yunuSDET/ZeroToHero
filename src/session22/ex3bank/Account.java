package session22.ex3bank;

import java.time.LocalDate;
import java.time.Period;

public abstract class Account {
        private double balance;
        private int ID;
        private int interestRate;
        public static final LocalDate startingDate=LocalDate.of(2020,1,1);
        public static LocalDate currentDate=LocalDate.now();

    public int getInterestRate() {
        return interestRate;
    }






    public void setInterestRate(int interestRate) {
        if(interestRate<0) {
            System.out.println("Interest can not be less than 0");
            return;
        }
        this.interestRate = interestRate;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {

        this.balance = balance;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public Account( int ID,double balance) {

        setBalance(balance);
        setID(ID);
        setInterestRate(interestRate);
    }



    public void deposit(double amount){

        balance+=amount;

    }


    public void withdraw(double amount){

       try{
           if(amount>balance) {
            throw new WithDrawException();
           }
         balance-=amount;

       }catch (WithDrawException e){
           System.out.println(e.getMessage());
       }

    }


    public double benefit() {
        Period period=Period.between(startingDate,currentDate);
        int days=period.getDays();
        return getBalance()*getInterestRate()*days/365;
    }




}
