import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueCalculation = true;

        while (continueCalculation) {
            System.out.print("Enter the first number: ");
            double num1 = scanner.nextDouble();
            
            System.out.print("Enter the second number: ");
            double num2 = scanner.nextDouble();
            
            System.out.print("Select an operation (+, -, *, /): ");
            char operation = scanner.next().charAt(0);
            
            double result = 0;
            boolean validOperation = true;
            
            switch (operation) {
                case '+':
                    result = add(num1, num2);
                    break;
                case '-':
                    result = subtract(num1, num2);
                    break;
                case '*':
                    result = multiply(num1, num2);
                    break;
                case '/':
                    if (num2 != 0) {
                        result = divide(num1, num2);
                    } else {
                        System.out.println("Error: Division by zero is not allowed.");
                        validOperation = false;
                    }
                    break;
                default:
                    System.out.println("Invalid operation. Please select +, -, *, or /.");
                    validOperation = false;
            }
            
            if (validOperation) {
                System.out.println("Result: " + result);
            }
            
            System.out.print("Do you want to perform another calculation? (yes/no): ");
            String userResponse = scanner.next().toLowerCase();
            continueCalculation = userResponse.equals("yes");
        }
        
        System.out.println("Calculator terminated.");
        scanner.close();
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        return a / b;
    }
}