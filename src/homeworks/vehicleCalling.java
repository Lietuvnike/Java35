package homeworks;

import java.util.Scanner;

public class vehicleCalling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter fuel amount in your vehicle");
        float fuel = scanner.nextFloat();
        System.out.println("Enter your vehicle's fuel usage per 100 km");
        float fuelUsage = scanner.nextFloat();
        System.out.println("Enter how many passengers will be in vehicle");
        int passengers = scanner.nextInt();
        System.out.println("Will you turn on air conditioner? true/false : ");
        char input = scanner.next().toLowerCase().charAt(0);
        boolean airConditioner = false;

        Vehicle vehicle = new Vehicle(fuel, fuelUsage, passengers);
        float maxDistance = vehicle.maxDistance();

        System.out.println("Maximum distance: " + String.format("%.2f", vehicle.maxDistance()) + " km");

        Car car = new Car(fuel, fuelUsage, passengers, airConditioner);
        float MaxDistance2 = car.getFuelUsage();
        System.out.println("Your vehicle can drive maximum of " + String.format("%.2f", car.maxDistance()) + " km");


    }
}
