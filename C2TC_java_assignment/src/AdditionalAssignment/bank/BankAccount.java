package AdditionalAssignment.bank;

//BankAccount.java
//Represents a simple bank account with deposit, withdrawal, and balance display

public class BankAccount {
 private int accountNumber;
 private double balance;

 // Parameterized Constructor
 public BankAccount(int accountNumber, double initialBalance) throws InvalidAmountException {
     if (initialBalance < 0) {
         throw new InvalidAmountException("Initial balance cannot be negative.");
     }
     this.accountNumber = accountNumber;
     this.balance = initialBalance;
 }

 // Deposit money
 public void deposit(double amount) throws InvalidAmountException {
     if (amount <= 0) {
         throw new InvalidAmountException("Deposit amount must be greater than zero.");
     }
     balance += amount;
     System.out.println("Deposited: " + amount);
 }

 // Withdraw money
 public void withdraw(double amount) throws InvalidAmountException, InsufficientFundsException {
     if (amount <= 0) {
         throw new InvalidAmountException("Withdrawal amount must be greater than zero.");
     }
     if (amount > balance) {
         throw new InsufficientFundsException("Insufficient balance for withdrawal.");
     }
     balance -= amount;
     System.out.println("Withdrawn: " + amount);
 }

 // Display current balance
 public void displayBalance() {
     System.out.println("Account Number: " + accountNumber + " | Balance: " + balance);
 }
}