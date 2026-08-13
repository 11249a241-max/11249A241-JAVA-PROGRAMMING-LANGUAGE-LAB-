class Employee {
    // Common employee details
    int employeeId;
    String name;
    double basicSalary;

    // Constructor
    Employee(int employeeId, String name, double basicSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.basicSalary = basicSalary;
    }

    // Display employee details
    void displayDetails() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Basic Salary: " + basicSalary);
    }
}

// Subclass
class PermanentEmployee extends Employee {
    double hra;
    double da;

    // Constructor
    PermanentEmployee(int employeeId, String name, double basicSalary,
                      double hra, double da) {
        super(employeeId, name, basicSalary);
        this.hra = hra;
        this.da = da;
    }

    // Calculate gross salary
    double calculateGrossSalary() {
        return basicSalary + hra + da;
    }

    // Display all details
    void displayPermanentDetails() {
        displayDetails();
        System.out.println("HRA: " + hra);
        System.out.println("DA: " + da);
        System.out.println("Gross Salary: " + calculateGrossSalary());
    }
}

public class EmployeeSalary {
    public static void main(String[] args) {

        PermanentEmployee emp =
            new PermanentEmployee(101, "Arun", 30000, 5000, 3000);

        emp.displayPermanentDetails();
    }
}