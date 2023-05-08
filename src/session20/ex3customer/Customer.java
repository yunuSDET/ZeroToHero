package session20.ex3customer;

public class Customer {
public String firstName,lastName,customerId;
public double balance;

    public Customer(String firstName, String lastName, String customerId, double balance) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.customerId = customerId;
        this.balance = balance;
    }

    public void withdraw(double amount){
        if(amount>balance){
            System.out.println("Invalid amount");
        }else {
            balance-=amount;
            System.out.println("Withdrawal successful. Amount : "+amount);
        }
    }

    public void deposit(double amount){
        balance+=amount;
        System.out.println("Deposit successful. Amount : "+amount);
    }

    public void showBalance(){
        System.out.println("Balance is " +balance);
    }


    public String toString() {
        return "Customer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", customerId='" + customerId + '\'' +
                ", balance=$" + balance +
                '}';
    }
}
