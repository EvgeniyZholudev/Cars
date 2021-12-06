package cars.impl;

import cars.IFlyable;

public abstract class AbstractFlyableCar extends AbstractCar implements IFlyable {

    private int wing;

    AbstractFlyableCar(int door, int wing) {
        super(door);
        this.wing = wing;
    }

    public int getWing() {
        return wing;
    }

    public void setWing(int wing) {
        this.wing = wing;
    }
}
