import java.util.Scanner;

final class Car_final {
    public String model;

    final void setmodel(String model) {
        this.model = model;
    }

    final String getmodel() {
        return model;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a car model: ");
        Car_final mycar = new Car_final();
        String UserInput = scanner.nextLine();
        mycar.setmodel(UserInput);
        System.out.print("Car model : " + mycar.getmodel());
    }
}