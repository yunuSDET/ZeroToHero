package session22.ex3bank;



public class ShortTerm extends Account{



    public ShortTerm(int ID, double balance) {
        super(ID, balance);
        setInterestRate(17);

    }


    @Override
    public void setBalance(double balance) {
        if(balance<1000) {
            throw new RuntimeException("Account can not be created. Must have at least 1000 TL");
        }
        super.setBalance(balance);
    }






}
