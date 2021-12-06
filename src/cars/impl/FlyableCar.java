package cars.impl;

import cars.IFlyableCar;

public class FlyableCar extends AbstractCar implements IFlyableCar {

    private int wheel;
    private int wing;

    public FlyableCar(int door, int wing, int wheel) {
        super(door);
        this.wing = wing;
        this.wheel = wheel;
    }

    public int getWheel() {
        return wheel;
    }

    public void setWheel(int wheel) {
        this.wheel = wheel;
    }

    public int getWing() {
        return wing;
    }

    public void setWing(int wing) {
        this.wing = wing;
    }
}
