package oop.Inheritance;

class Vehicle{
    /*New access modifier - protected. Protected class when you create subclass (poklasis).
    */
    protected String brand;
    public void honk(){
        System.out.println("Tu tu");
        System.out.println("Band: " + brand);
    }
}

class Bike extends Vehicle{
    public void honk(){
        System.out.println("Bip bip");
        System.out.println("Brand: " + brand);
    }
}

public class VehicleExample {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.brand = "Tesla";
        vehicle.honk();

        Bike bike = new Bike();
        bike.brand = "Cube";
        bike.honk();
    }
}
