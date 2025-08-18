package Assignment_1_Utility;

import Assignment_1_Employee.Employee;

/**
 * Utility class for operations on Employee objects.
 */
public class EmployeeUtility{

    /**
     * Displays employee details.
     */
    public static void printEmployeeDetails(Employee emp) {
        System.out.println(emp.getDetails());
    }

    /**
     * Increases employee salary by percentage.
     * Demonstrates access to protected setter.
     */
    public static void increaseSalary(Employee emp, double percent) {
        double newSalary = emp.getSalary() + (emp.getSalary() * percent / 100);
        // Using protected setter inside same package via inheritance access
        emp.setSalary(newSalary);
        System.out.println("Salary updated for " + emp.getName());
    }
}