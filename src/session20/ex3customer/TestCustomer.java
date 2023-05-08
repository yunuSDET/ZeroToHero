package session20.ex3customer;

public class TestCustomer {

    public static void main(String[] args) {

        Customer customer=new Customer("yunus","külcü","24522",150_000);

        customer.withdraw(1500);
        customer.withdraw(5000);
        customer.withdraw(7000);

        customer.deposit(1250);
        customer.deposit(760);
        customer.deposit(25000);

        customer.showBalance();


    }
}
