package Accounts;

public class CreditAccount extends Account {
    
    protected CreditAccount(int cash) {
        super(cash);
    }

    public static Account createAccount(int cash) throws IllegalArgumentException {

        if (cash < 0) {
            throw new IllegalArgumentException();
        }
        System.out.println(create);
        return new CreditAccount(cash);
    }
}