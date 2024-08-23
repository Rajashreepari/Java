import java.util.Scanner;

class Car {
    private String make;
    private String model;
    private int year;
    private double price;

    // Constructor to initialize the car's properties
    public Car(String make, String model, int year, double price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    // Method to display the car's information
    public void displayCarInfo() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for car details
        System.out.print("Enter car make: ");
        String make = scanner.nextLine();

        System.out.print("Enter car model: ");
        String model = scanner.nextLine();

        System.out.print("Enter car year: ");
        int year = scanner.nextInt();

        System.out.print("Enter car price: ");
        double price = scanner.nextDouble();

        // Create a Car instance with the user-provided details
        Car car = new Car(make, model, year, price);

        // Display the car's information
        car.displayCarInfo();

        scanner.close();
    }
}