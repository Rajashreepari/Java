abstract class Vehicle {
    protected String make;
    protected String model;

    public Vehicle(String make, String model) {
        this.make = make;
        this.model = model;
    }
}

abstract class FourWheeler extends Vehicle {
    protected int numberOfDoors;

    public FourWheeler(String make, String model, int numberOfDoors) {
        super(make, model);
        this.numberOfDoors = numberOfDoors;
    }

    public void displayFourWheelerInfo() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Number of Doors: " + numberOfDoors);
    }
}

abstract class TwoWheeler extends Vehicle {
    protected boolean hasCarrier;

    public TwoWheeler(String make, String model, boolean hasCarrier) {
        super(make, model);
        this.hasCarrier = hasCarrier;
    }

    public void displayTwoWheelerInfo() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Has Carrier: " + hasCarrier);
    }
}

class Car extends FourWheeler {
    public Car(String make, String model, int numberOfDoors) {
        super(make, model, numberOfDoors);
    }

    public void displayCarInfo() {
        displayFourWheelerInfo();
    }
}

class Bike extends TwoWheeler {
    public Bike(String make, String model, boolean hasCarrier) {
        super(make, model, hasCarrier);
    }

    public void displayBikeInfo() {
        displayTwoWheelerInfo();
    }
}

public class Vehicle_hybrid {
    public static void main(String[] args) {
        Car car = new Car("Honda", "Civic", 4);
        car.displayCarInfo();
        System.out.println();

        Bike bike = new Bike("Suzuki", "Hayabusa", false);
        bike.displayBikeInfo();
    }
}
