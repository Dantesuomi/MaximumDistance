/*
Create a subclass (child’s class) called Car that extends (inherits) all Vehicle class
fields and methods. Create an additional field airConditioner (boolean) and
create a custom constructor for Car class, so it takes four values as input (fuel,
fuelUsage, passengers, airConditioner). Then override method
maxDistance and take in calculations airConditioner field value. If it’s true then
add additional 10% to fuel consumption after you have calculated passengers
created impact. So to take the previous example with two passengers fuel
consumption increased from 6.7 to 7.37 and if airConditioner field value is true
calculate additional 10% from 7.37 so it would be 7.37 + 7.37 * 0.1 = 8.107
 */

class Car extends Vehicle{
    private boolean airConditioner;

    public Car(float fuel, float fuelUsage, int passengers, boolean airConditioner) {
        super(fuel, fuelUsage, passengers);
        this.airConditioner = airConditioner;
    }

    public float maxDistance(){
        float fuelUsage;
        if(airConditioner)
        {
            fuelUsage = this.getFuelUsage() + this.getFuelUsage() * 0.1f;
        }
        else {
            fuelUsage = this.getFuelUsage();
        }

        float maxDistance = (this.getFuel()/fuelUsage) * 100;
        float roundedDistance = Math.round(maxDistance * 100f) / 100f;
        return roundedDistance;
    }
}
