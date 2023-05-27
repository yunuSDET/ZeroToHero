package session22.ex3bank;

import session21.ex6library.Book;

import java.time.LocalDate;
import java.time.Period;
import java.util.*;

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
                return;
            }
        }
    }


    public void withdraw(int ID, double cash){
        for (Account each : accounts) {
            if (each.getID()==ID) {
                each.withdraw(cash);
                return;
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
            return;
        }

        Random random=new Random();
        Account account=accountArrayList.get(random.nextInt(accountArrayList.size()));
        account.deposit(10000);


    }

}
