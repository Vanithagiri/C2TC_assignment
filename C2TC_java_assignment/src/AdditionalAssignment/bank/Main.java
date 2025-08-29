package AdditionalAssignment.bank;

//Main.java
//Demonstrates the BankAccount class with exception handling

public class Main {
 public static void main(String[] args) {
     try {
         // Creating account with initial balance
         BankAccount account = new BankAccount(1001, 5000);

         account.displayBalance();

         // Deposit
         try {
             account.deposit(2000);
         } catch (InvalidAmountException e) {
             System.out.println("Deposit Error: " + e.getMessage());
         } finally {
             account.displayBalance();
         }

         // Withdrawal
         try {
             account.withdraw(8000); // This will throw exception
         } catch (InvalidAmountException | InsufficientFundsException e) {
             System.out.println("Withdrawal Error: " + e.getMessage());
         } finally {
             account.displayBalance();
         }

         // Invalid deposit
         try {
             account.deposit(-500); // Invalid amount
         } catch (InvalidAmountException e) {
             System.out.println("Deposit Error: " + e.getMessage());
         } finally {
             account.displayBalance();
         }

     } catch (InvalidAmountException e) {
         System.out.println("Account Creation Error: " + e.getMessage());
     }
 }
}