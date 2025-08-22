package assignment;

public class CheckingAccount extends Account {

    public CheckingAccount(String accountHolder, double balance) {
        super(accountHolder, balance);
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount + " | New Balance: " + balance);
    }

    @Override
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + " | New Balance: " + balance);
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    @Override
    public double getBalance() {
        return balance;
    }
}