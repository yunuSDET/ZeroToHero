package session22.ex3bank;

public class WithDrawException extends RuntimeException{

    public WithDrawException() {
        super("Insufficient balance");
    }


}
