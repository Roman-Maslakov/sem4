

import Accounts.*;
import Exceptions.IllegalArgumentException;
import Exceptions.InsufficientFundsException;

public class Program {

    public static void main(String[] args) {
        
        try {
            Account bankroll = DebitAccount.createAccount(100);
            bankroll.deposit(100);
            bankroll.printBankroll();
            bankroll.withdrawCash(100); // Exception
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        } catch (InsufficientFundsException e) {
            e.printStackTrace();
        }

        try {
            Account a1 = DebitAccount.createAccount(300);
            Account a2 = CreditAccount.createAccount(500);
            Transaction.transaction(a1, a2, -100);
        } catch (ImpossibleTransationException e) {
            e.printStackTrace();
        }
    }
}