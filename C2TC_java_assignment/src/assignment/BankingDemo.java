package assignment;

public class BankingDemo {
    public static void main(String[] args) {
        // Create accounts
        SavingsAccount savings = new SavingsAccount("Alice", 2000);
        CheckingAccount checking = new CheckingAccount("Bob", 1500);

        // Display initial details
        savings.displayDetails();
        checking.displayDetails();

        // Perform transactions
        Transaction transaction = new Transaction();
        transaction.performTransaction(savings, 500, true);  // Deposit
        transaction.performTransaction(checking, 700, false); // Withdraw

        // Display updated balances
        System.out.println("Savings Balance: " + savings.getBalance());
        System.out.println("Checking Balance: " + checking.getBalance());

        // Show total accounts
        System.out.println("Total Accounts in Bank: " + Bank.getTotalAccounts());
    }
}