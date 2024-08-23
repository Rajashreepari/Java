import java.util.Scanner;

public class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        setSalary(salary);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        } else {
            System.out.println("Error: Salary cannot be negative.");
        }
    }

    public double getSalary() {
        return this.salary;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Employee employee = new Employee("", 0);

        boolean running = true;

        while (running) {
            System.out.println("\nEmployee Information Management System");
            System.out.println("1. Set Name");
            System.out.println("2. Set Salary");
            System.out.println("3. Show Information");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter the employee's name: ");
                    String name = scanner.nextLine();
                    employee.setName(name);
                    break;

                case 2:
                    System.out.print("Enter the employee's salary (0 or positive value): ");
                    double salary = scanner.nextDouble();
                    employee.setSalary(salary);
                    break;

                case 3:
                    System.out.println("Employee Name: " + employee.getName());
                    System.out.println("Employee Salary: " + employee.getSalary());
                    break;

                case 4:
                    System.out.println("Exiting...");
                    running = false;
                    break;

                default:
                    System.out.println("Error: Invalid choice. Please enter 1, 2, 3, or 4.");
                    break;
            }
        }
    }
}