package Assignment_1_Employee;

/**
 * Developer class extends Employee and adds programmingLanguage attribute.
 */
public class Developer extends Employee {
    private String programmingLanguage;

    public Developer(String name, String employeeId, double salary, String programmingLanguage) {
        super(name, employeeId, salary);
        this.programmingLanguage = programmingLanguage;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public String getDetails() {
        return super.getDetails() + ", Language: " + programmingLanguage;
    }
}