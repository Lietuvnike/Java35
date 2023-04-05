package homeworks;

import oop.Car;

public class Vehicle {
    private float fuel;
    private float fuelUsage;
    private int passengers;

    public Vehicle(float fuel, float fuelUsage, int passengers){
    this.fuel = fuel;
    this.fuelUsage =fuelUsage * (1 + passengers * 0.05f);
    this.passengers = passengers;}

    public void setFuel(float fuel){ this.fuel = fuel;}
    public void setFuelUsage(float fuelUsage){this.fuelUsage = fuelUsage;}
    public void setPassengers(int passengers){this.passengers = passengers;}

    public float getFuel() {return fuel;}
    public float getFuelUsage() {return fuelUsage;}
    public int getPassengers(){return  passengers;}

    public float maxDistance (float fuel, float fuelUsage, int passengers){
        float totalFuelUsage = fuelUsage * (1 + passengers * 0.05f);
        return fuel / (totalFuelUsage * (1 + passengers * 0.05f)) * 100;
    }
    public float maxDistance(){

        return fuel / (fuelUsage * (1 + passengers * 0.05f)) * 100;
    }
}



