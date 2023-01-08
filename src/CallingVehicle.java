import java.util.Scanner;

public class CallingVehicle {
    public static void main(String[] args) {
        float fuel, fuelUsage;
        int passengers;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Please, enter the amount of fuel");
            fuel = scanner.nextFloat();

            System.out.println("Please, enter the fuel consumption per 100 km");
            fuelUsage = scanner.nextFloat();

            System.out.println("Please, enter the amount of passengers in the car");
            passengers = scanner.nextInt();

            if(fuel < 0 && fuelUsage < 0 && passengers < 0){
                System.out.println("Values cannot be negative");
            }
        } while (fuel < 0 && fuelUsage < 0 && passengers < 0);

        Vehicle vehicle1 = new Vehicle(fuel, fuelUsage, passengers);

        System.out.println("Maximal distance will be: " + vehicle1.maxDistance() + " km");

    }
}
