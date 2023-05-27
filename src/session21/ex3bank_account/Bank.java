package session21.ex3bank_account;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Bank {
    private ArrayList<Account> accounts;

    public Bank() {
        this.accounts = new ArrayList<>();
    }

    public ArrayList<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(ArrayList<Account> accounts) {
        this.accounts = accounts;
    }

    public void addAccount(long accountNumber,String accountHolderName,double balance){
        accounts.add(new Account(accountNumber,accountHolderName,balance));
    }
    public ArrayList<Account> searchByBalance(double minimumBalance){
        ArrayList<Account> result=new ArrayList<>();
        for (Account each : accounts) {
            if(each.getBalance()>=minimumBalance) result.add(each);
        }
        return result;
        //return accounts.stream().filter(i->i.getBalance()>=minimumBalance).collect(Collectors.toCollection(ArrayList::new));
    }


    public Account searchByName(String accountHolderName){
        for (Account each : accounts) {
            if(each.getAccountHolderName().equals(accountHolderName)){
                return each;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "accounts=" + accounts +
                '}';
    }
}
