

import Accounts.Account;
import Exceptions.IllegalArgumentException;
import Exceptions.InsufficientFundsException;

public class Transaction {

    static String transaction = "Transaction ok";

    public static void transaction(Account from, Account to, int cash) throws ImpossibleTransationException {

        if (cash < 0)
            throw new ImpossibleTransationException("Transaction failed. Negative amount");

        try {
            if (from.withdrawCash(cash)) {
                to.deposit(cash);
                System.out.println(transaction);
            }
        } catch (InsufficientFundsException | IllegalArgumentException e) {
            throw new ImpossibleTransationException("Transaction failed. Insufficient funds");
        }
    }
}

class ImpossibleTransationException extends Exception {

    ImpossibleTransationException(String msg) {

        super(msg);
    }
}