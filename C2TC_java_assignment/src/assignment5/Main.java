package assignment5;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // process multiple transactions until input ends
        while (sc.hasNextLine()) {
            String bookingDetails = sc.nextLine().trim();
            if (bookingDetails.isEmpty()) break; // stop if blank line

            String[] details = bookingDetails.split(",");
            String stageEvent = details[0];
            String customer = details[1];
            int noOfSeats = Integer.parseInt(details[2]);

            // create TicketBooking object
            TicketBooking booking = new TicketBooking(stageEvent, customer, noOfSeats);

            if (!sc.hasNextInt()) break;
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1: { // cash
                    double amount = sc.nextDouble();
                    sc.nextLine();
                    booking.makePayment(amount);
                    break;
                }
                case 2: { // wallet
                    double amount = sc.nextDouble();
                    sc.nextLine();
                    String walletNumber = sc.nextLine();
                    booking.makePayment(amount, walletNumber);
                    break;
                }
                case 3: { // credit card
                    String holderName = sc.nextLine();
                    double amount = sc.nextDouble();
                    sc.nextLine();
                    String cardType = sc.nextLine();
                    String ccv = sc.nextLine();
                    booking.makePayment(holderName, amount, cardType, ccv);
                    break;
                }
                default:
                    System.out.println("Invalid choice");
            }
        }
        sc.close();
    }
}