package Assignment_1;

import Assignment_1_Employee.Developer;
import Assignment_1_Employee.Manager;
import Assignment_1_Utility.EmployeeUtility;

/**
 * Main class outside of any package.
 * Demonstrates usage of employees and utilities packages.
 */
public class AssignmentMain {
    public static void main(String[] args) {
        // Create Manager object
        Manager mgr = new Manager("Alice", "M101", 80000, "Sales");

        // Create Developer object
        Developer dev = new Developer("Bob", "D202", 60000, "Java");

        // Use EmployeeUtilities
        EmployeeUtility.printEmployeeDetails(mgr);
        EmployeeUtility.printEmployeeDetails(dev);

        // Increase salary
        EmployeeUtility.increaseSalary(mgr, 10);
        EmployeeUtility.increaseSalary(dev, 15);

        // Print details again
        System.out.println("\n--- After Salary Increment ---");
        EmployeeUtility.printEmployeeDetails(mgr);
        EmployeeUtility.printEmployeeDetails(dev);
    }
}