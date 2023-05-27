package session22.ex3bank;



public class LongTerm extends Account{



    public LongTerm(int ID, double balance) {
        super(ID, balance);
        setInterestRate(24);

    }


    @Override
    public void setBalance(double balance) {
        if(balance<1500) {
            throw new RuntimeException("Account can not be created. Must have at least 1500 TL");
        }
        super.setBalance(balance);
    }




    

}
