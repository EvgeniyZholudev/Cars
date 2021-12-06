package cars;

import cars.engine.Engine;

public abstract class AbstractCar {

    private int door;
    private Engine engine;

    public AbstractCar(int door) {
        this.door = door;
    }

    public int getDoor() {
        return door;
    }

    public void setDoor(int door) {
        this.door = door;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}
