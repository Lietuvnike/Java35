package homeworks;

public class Car extends Vehicle {
    private boolean airConditioner;

    public Car(float fuel, float fuelUsage, int passengers, boolean airConditioner) {
        super(fuel, fuelUsage, passengers);
        this.airConditioner = airConditioner;
    }

    public float MaxDistance() {
        float airConditionerAdd;

        if (airConditioner) {
            airConditionerAdd = 1.1f;
        } else {
            airConditionerAdd = 1f;
        }

        float usage = getFuelUsage() * (1 + getPassengers() * 0.05f);
        float maxDistance = getFuel() / (usage * airConditionerAdd) * 1;
        return maxDistance;
    }

}