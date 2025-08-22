package assignment;

public class SavingsAccount extends Account {
    private static final double MIN_BALANCE = 500.0;

    public SavingsAccount(String accountHolder, double balance) {
        super(accountHolder, balance);
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount + " | New Balance: " + balance);
    }

    @Override
    public void withdraw(double amount) {
        if (balance - amount >= MIN_BALANCE) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + " | New Balance: " + balance);
        } else {
            System.out.println("Insufficient balance. Min balance required: " + MIN_BALANCE);
        }
    }

    @Override
    public double getBalance() {
        return balance;
    }
}
