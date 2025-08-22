package assignment4;

public class Transaction {
    private final double transactionFee = 10.0;  // final variable

    public final void performTransaction(Account account, double amount, boolean isDeposit) {
        if (isDeposit) {
            account.deposit(amount - transactionFee);
        } else {
            account.withdraw(amount + transactionFee);
        }
        System.out.println("Transaction fee of " + transactionFee + " applied.");
    }
}