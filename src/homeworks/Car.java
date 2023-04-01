package homeworks;

public class Car extends Vehicle {
    private boolean airConditioner;

    public Car(float fuel, float fuelUsage, int passengers, boolean airConditioner) {
        super(fuel, fuelUsage, passengers);
        this.airConditioner = airConditioner;
    }

    public float MaxDistance() {
        float fuelConsumption = this.getFuelUsage() * (1 + (1 + 0.05f * getPassengers()));
        float fuelConsumption1 = fuelConsumption;

        if (airConditioner) {
            fuelConsumption1 = fuelConsumption * 1.1f;
        }
        return getFuel() / fuelConsumption1 * 100;
    }

    public boolean isAirConditioner() {
        return airConditioner;
    }

    public void setAirConditioner(boolean airConditioner) {
        this.airConditioner = airConditioner;
    }
}