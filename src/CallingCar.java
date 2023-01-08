import java.util.Scanner;

public class CallingCar {
    public static void main(String[] args) {
        float fuel, fuelUsage;
        int passengers;
        boolean airConditioner;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Please, enter the amount of fuel");
            fuel = scanner.nextFloat();

            System.out.println("Please, enter the fuel consumption per 100 km");
            fuelUsage = scanner.nextFloat();

            System.out.println("Please, enter the amount of passengers in the car");
            passengers = scanner.nextInt();

            System.out.println("Please, enter if air conditioner is on (true/false)");
            airConditioner = scanner.nextBoolean();

            if(fuel < 0 && fuelUsage < 0 && passengers < 0){
                System.out.println("Values cannot be negative");
            }
        } while (fuel < 0 && fuelUsage < 0 && passengers < 0);

        Vehicle vehicle1 = new Car(fuel, fuelUsage, passengers, airConditioner);

        System.out.println("Maximal distance will be: " + vehicle1.maxDistance() + " km");
    }
}
