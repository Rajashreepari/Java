import java.util.Scanner;

class Employee {
    private String name;
    private int id;
    private double basicSalary;
    private double allowances;

    // Default constructor
    public Employee() {}

    // Parameterized constructor
    public Employee(String name, int id, double basicSalary, double allowances) {
        this.name = name;
        this.id = id;
        this.basicSalary = basicSalary;
        this.allowances = allowances;
    }

    // Method to calculate gross salary
    public double calculateGrossSalary() {
        return this.basicSalary + this.allowances;
    }

    // Method to display employee details
    public void displayEmployeeDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Basic Salary: $" + basicSalary);
        System.out.println("Allowances: $" + allowances);
        System.out.println("Gross Salary: $" + calculateGrossSalary());
    }
}

public class EmployeeSalaryManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of employees: ");
        int numberOfEmployees = scanner.nextInt();
        scanner.nextLine();  // Consume newline

        if (numberOfEmployees <= 0) {
            System.out.println("No employees to manage.");
            return;
        }

        Employee[] employees = new Employee[numberOfEmployees];

        for (int i = 0; i < numberOfEmployees; i++) {
            System.out.println("Enter details for employee " + (i + 1) + ":");

            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("ID: ");
            int id = scanner.nextInt();

            System.out.print("Basic Salary: ");
            double basicSalary = scanner.nextDouble();

            System.out.print("Allowances: ");
            double allowances = scanner.nextDouble();
            scanner.nextLine();  // Consume newline

            employees[i] = new Employee(name, id, basicSalary, allowances);
        }

        for (int i = 0; i < numberOfEmployees; i++) {
            System.out.println("Details of employee " + (i + 1) + ":");
            employees[i].displayEmployeeDetails();
            System.out.println();
        }

        scanner.close();
    }
}
