package session22.ex3bank;



public class Special extends Account{
        private double startingBalance;





    public Special(int ID, double balance) {
        super(ID, balance);
        setInterestRate(12);
        startingBalance=balance;
    }


    @Override
    public void setBalance(double balance) {
        if(balance<startingBalance) {
            throw new RuntimeException("Balance can not be less than starting balance : "+startingBalance);
        }
        super.setBalance(balance);
    }




    

}
