package assignment5;

public class TicketBooking {
    // private attributes
    private String stageEvent;
    private String customer;
    private Integer noOfSeats;

    // default constructor
    public TicketBooking() {
    }

    // parameterized constructor
    public TicketBooking(String stageEvent, String customer, Integer noOfSeats) {
        this.stageEvent = stageEvent;
        this.customer = customer;
        this.noOfSeats = noOfSeats;
    }

    // getters and setters
    public String getStageEvent() {
        return stageEvent;
    }

    public void setStageEvent(String stageEvent) {
        this.stageEvent = stageEvent;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public Integer getNoOfSeats() {
        return noOfSeats;
    }

    public void setNoOfSeats(Integer noOfSeats) {
        this.noOfSeats = noOfSeats;
    }

    // -------------------
    // Overloaded methods
    // -------------------

    // 1. Cash Payment
    public void makePayment(double amount) {
        System.out.println("Stage event:" + stageEvent);
        System.out.println("Customer:" + customer);
        System.out.println("Number of seats:" + noOfSeats);
        System.out.printf("Amount %.1f paid in cash%n", amount);
    }

    // 2. Wallet Payment
    public void makePayment(double amount, String walletNumber) {
        System.out.println("Stage event:" + stageEvent);
        System.out.println("Customer:" + customer);
        System.out.println("Number of seats:" + noOfSeats);
        System.out.printf("Amount %.1f paid using wallet number %s%n", amount, walletNumber);
    }

    // 3. Credit Card Payment
    public void makePayment(String holderName, double amount, String creditCardType, String ccv) {
        System.out.println("Stage event:" + stageEvent);
        System.out.println("Customer:" + customer);
        System.out.println("Number of seats:" + noOfSeats);
        System.out.println("Holder name:" + holderName);
        System.out.printf("Amount %.1f paid using %s card%n", amount, creditCardType);
        System.out.println("CCV:" + ccv);
    }
}