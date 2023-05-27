package session21.ex3bank_account;

public class Test {

    public static void main(String[] args) {

        Bank bank=new Bank();

        bank.addAccount(12345,"yunus",150000);
        bank.addAccount(45563453,"burak",250000);
        bank.addAccount(42312,"caglar",78000);
        bank.addAccount(65442,"recep",30554);
        bank.addAccount(75433,"can",29000);

        bank.searchByBalance(50000).forEach(System.out::println);


        System.out.println("-".repeat(100));

        bank.searchByName("yunus").withdraw(34342);
        bank.searchByName("yunus").deposit(66000);

        System.out.println(bank.searchByName("yunus"));

        System.out.println("-".repeat(100));


        bank.getAccounts().forEach(i->i.deposit(50000));
        bank.getAccounts().forEach(i->i.withdraw(49000));

        bank.getAccounts().forEach(System.out::println);




    }
}
