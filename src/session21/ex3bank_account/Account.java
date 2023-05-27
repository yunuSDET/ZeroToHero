package session21.ex3bank_account;

public class Account {
    private long accountNumber;
    private String accountHolderName;
    private double balance;


    public Account(long accountNumber, String accountHolderName, double balance) {
        setAccountNumber(accountNumber);
        setAccountHolderName(accountHolderName);
        setBalance(balance);
    }

    public void deposit(double amount){
        if(amount<=0){
            System.out.println("Invalid amount");
            return;
        }
        balance+=amount;
    }

    public void withdraw(double amount){
        if(amount<=0) {
            System.out.println("Amount can't be less than or equals to 0");
            return;
        }
        if(balance<amount){
            System.out.println("Invalid amount");
            return;
        }
        balance-=amount;
    }

    public long getAccountNumber() {
        return accountNumber;
    }





    public void setAccountNumber(long accountNumber) {
        if (accountNumber <= 0) {
            System.out.println("Invalid account number");
            return;
        }
        this.accountNumber = accountNumber;

    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {

        if (!accountHolderName.matches("[a-zA-Z ]+")) {
            System.out.println("Invalid account holder name");
            return;
        }

        this.accountHolderName = accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance < 0) {
            System.out.println("Invalid balance");
            return;
        }
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNumber=" + accountNumber +
                ", accountHolderName='" + accountHolderName + '\'' +
                ", balance=" + balance +
                '}';
    }
}
