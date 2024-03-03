package Accounts;

import Exceptions.IllegalArgumentException;
import Exceptions.InsufficientFundsException;

public abstract class Account {

    private int cash;
    static String create = "Account created";
    static String deposit = "Top up ok";
    static String withdraw = "Withdraw success";

    protected Account(int cash) {

        this.cash = cash;
    }

    public boolean deposit(int cash) throws IllegalArgumentException {

        if (cash >= 0) {
            this.cash += cash;
            System.out.println(deposit);
            return true;
        }
        throw new IllegalArgumentException();
    }

    public int getCash() {

        return this.cash;
    }

    public boolean withdrawCash(int cash) throws InsufficientFundsException, IllegalArgumentException {

        if (cash > 0) {
            if (this.cash >= cash) {
                this.cash -= cash;
                System.out.println(withdraw);
                return true;
            }

            throw new InsufficientFundsException();
        }
        
        throw new IllegalArgumentException();
    }

    public void printBankroll() {

        System.out.println("Bankroll: " + getCash());
    }
}