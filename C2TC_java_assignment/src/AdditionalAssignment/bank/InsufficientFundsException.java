package AdditionalAssignment.bank;

//InsufficientFundsException.java
//Custom exception for handling insufficient balance

public class InsufficientFundsException extends Exception {
 public InsufficientFundsException(String message) {
     super(message);
 }
}