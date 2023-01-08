public class Vehicle {

    private float fuel;
    private float fuelUsage;
    private int passengers;

    public Vehicle(float fuel, float fuelUsage, int passengers){
        this.fuel = fuel;
        this.passengers = passengers;
        float increasedFuelUsage = (float) (fuelUsage * 0.05) * passengers;
        this.fuelUsage = fuelUsage + increasedFuelUsage;
    }
    public float maxDistance(){
        float maxDistance = (fuel/fuelUsage) * 100;
        float roundedDistance = Math.round(maxDistance * 100f) / 100f;
        return roundedDistance;
    }

    public float getFuel(){
        return fuel;
    }

    public float getFuelUsage(){
        return fuelUsage;
    }

    public int getPassengers(){
        return passengers;
    }
}
