package cars.impl;

import cars.IDrivable;

public abstract class AbstractDrivableCar extends AbstractCar implements IDrivable {

    private int wheel;

    AbstractDrivableCar(int door, int wheel) {
        super(door);
        this.wheel = wheel;
    }

    public int getWheel() {
        return wheel;
    }

    public void setWheel(int wheel) {
        this.wheel = wheel;
    }
}
