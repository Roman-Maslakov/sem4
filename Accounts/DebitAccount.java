package Accounts;

public class DebitAccount extends Account {
    
    protected DebitAccount(int cash) {
        super(cash);
    }

    public static Account createAccount(int cash) throws IllegalArgumentException {

        if (cash < 0) {
            throw new IllegalArgumentException();
        }
        System.out.println(create);
        return new DebitAccount(cash);
    }
}