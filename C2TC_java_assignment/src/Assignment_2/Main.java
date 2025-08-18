package Assignment_2;

public class Main {
    public static void main(String[] args) {
        // Creating Student object
        Student s1 = new Student(); // Warning only if not used later

        // Creating Commission object
        Commission emp = new Commission();
        emp.acceptDetails();      // Accept employee details
        emp.calculateCommission(); // Calculate and display commission
    }
}
