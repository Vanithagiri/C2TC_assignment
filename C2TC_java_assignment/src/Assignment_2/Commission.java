package Assignment_2;

import java.util.Scanner;

class Commission {
    String name;
    String address;
    String phone;
    double sales_amount;

    // Method to accept details
    void acceptDetails() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        name = sc.nextLine();

        System.out.print("Enter Address: ");
        address = sc.nextLine();

        System.out.print("Enter Phone: ");
        phone = sc.nextLine();

        System.out.print("Enter Sales Amount: ");
        sales_amount = sc.nextDouble();
    }

    // Method to calculate and display commission
    void calculateCommission() {
        double commission = 0;

        if (sales_amount >= 100000) {
            commission = sales_amount * 0.10;
        } else if (sales_amount >= 50000) {
            commission = sales_amount * 0.05;
        } else if (sales_amount >= 30000) {
            commission = sales_amount * 0.03;
        } else {
            commission = 0;
        }

        System.out.println("\n--- Commission Details ---");
        System.out.println("Name       : " + name);
        System.out.println("Address    : " + address);
        System.out.println("Phone      : " + phone);
        System.out.println("Sales Amt  : " + sales_amount);
        System.out.println("Commission : " + commission);
    }
}
