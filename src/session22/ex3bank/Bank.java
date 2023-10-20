package session22.ex3bank;

import session21.ex6library.Book;

import java.time.LocalDate;
import java.time.Period;
import java.util.*;
import java.util.function.Consumer;

public class Bank {
    private ArrayList<Account> accounts;


    public Bank() {
        this.accounts = new ArrayList<>();
    }

    public ArrayList<Account> getAccounts() {
        return accounts;
    }

    public void getAccount(){
        for (Account each : accounts) {
            System.out.println(each);
        }
    }

    public void getDate(){

        System.out.println(LocalDate.now());

    }


    public void deposit(int ID,double cash){
        for (Account each : accounts) {
            if (each.getID()==ID) {
                each.deposit(cash);
                each.getTransactions().add(cash+" is deposited successfully at "+LocalDate.now());
                return;
            }
        }
    }


    public void withdraw(int ID, double cash){
        for (Account each : accounts) {
            if (each.getID()==ID) {
                each.withdraw(cash);
                each.getTransactions().add(cash+" is withdrawed successfully at "+LocalDate.now());
                return;
            }
        }
    }

    public void showIDs(){
        for (Account each : accounts) {
            System.out.println("Id is: "+each.getID());
        }
    }
    public void showAccount(){


        for (Account each : accounts) {
            int size=each.getTransactions().size();

            System.out.println("Id is"+each.getID());
            System.out.println("Total benefit is : "+each.benefit());
                    if(size>5 ) {
                        for (int i = size-5; i < size; i++) {
                            System.out.println(each.getTransactions().get(i));
                        }
                    }else{
                        if(each.getTransactions().size()!=0) System.out.println(each.getTransactions());

                    }


        }


        
    }

    public void Create_S_ID_balance(int ID,double balance){
        accounts.add(new ShortTerm(ID,balance));
    }

    public void Create_L_ID_balance(int ID,double balance){
        accounts.add(new LongTerm(ID,balance));
    }

    public void Create_O_ID_balance(int ID,double balance){
        accounts.add(new Special(ID,balance));
    }

    public void Create_C_ID_balance(int ID,double balance){
        accounts.add(new Current(ID,balance));
    }

    public void setDate(int day,int month,int year){
        LocalDate localDate=LocalDate.of(year,month,day);
        if(Period.between(Account.startingDate,localDate).getDays()<0){
            throw new RuntimeException("Invalid date");
        }
        Account.currentDate=localDate;
    }

    public void sortition(){
        ArrayList<Account> accountArrayList=new ArrayList<>();


        for (Account each : accounts) {
            if(each instanceof Special){
                for (int i =0; i <each.getBalance()/2000 ; i++) {
                    accountArrayList.add(each);
                }
            }
        }
        if(accountArrayList.isEmpty()) return;


        if(accountArrayList.stream().distinct().count()==1){
            accountArrayList.get(0).deposit(10000);
            System.out.println("Winner account is "+accountArrayList.get(0).getID()+" and new balance is "+accountArrayList.get(0).getBalance());
            return;
        }

        Random random=new Random();
        Account account=accountArrayList.get(random.nextInt(accountArrayList.size()));
        double oldBalance=account.getBalance();
        account.deposit(10000);
        System.out.println("Winner account is "+account.getID()+" old balance is "+oldBalance+ " and new balance is "+account.getBalance());

    }

}
