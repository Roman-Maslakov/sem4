package Exceptions;

public class InsufficientFundsException extends Exception {
 
    public InsufficientFundsException() {

        super("Can not invoke operation. Insufficient funds");
    }
}