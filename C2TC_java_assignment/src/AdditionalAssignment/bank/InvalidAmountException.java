package AdditionalAssignment.bank;

//InvalidAmountException.java
//Custom exception for handling invalid deposit/withdrawal amounts

public class InvalidAmountException extends Exception {
 public InvalidAmountException(String message) {
     super(message);
 }
}