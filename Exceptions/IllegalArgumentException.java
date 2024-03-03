package Exceptions;

public class IllegalArgumentException extends Exception{
    
    public IllegalArgumentException() {

        super("Can not invoke procedure. Negative amount");
    }
}