package cars.impl;

import cars.IMachine;
import cars.engine.IEngine;

public abstract class AbstractCar implements IMachine {

    private int door;
    private IEngine engine;

    AbstractCar(int door) {
        this.door = door;
    }

    public int getDoor() {
        return door;
    }

    public void setDoor(int door) {
        this.door = door;
    }

    public IEngine getEngine() {
        return engine;
    }

    public void setEngine(IEngine engine) {
        this.engine = engine;
    }
}
