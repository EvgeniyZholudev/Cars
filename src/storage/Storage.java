package storage;

import cars.IFlyableCar;
import cars.IMachine;
import factory.IRepairFactory;

import java.util.ArrayList;
import java.util.List;

public class Storage implements IStorage {

    private int wheel;
    private int door;
    private int wing;
    private List<IMachine> cars;
    private IRepairFactory repairFactory;

    public Storage(int wheel, int door, int wing) {
        this.wheel = wheel;
        this.door = door;
        this.wing = wing;
        this.cars = new ArrayList<>();
    }

    public void fixCar() {
        this.repairFactory.fix(this.cars.get(0), wheel, door);
    }

    public void fixFlyableCar() {
        for (IMachine car : cars) {
            if (car instanceof IFlyableCar) {
                this.repairFactory.fix((IFlyableCar) car, wheel, door, wing);
            }
        }
    }

    public int getWheel() {
        return wheel;
    }

    public void setWheel(int wheel) {
        this.wheel = wheel;
    }

    public int getDoor() {
        return door;
    }

    public void setDoor(int door) {
        this.door = door;
    }

    public List<IMachine> getCars() {
        return cars;
    }

    public void setCars(List<IMachine> cars) {
        this.cars = cars;
    }

    public IRepairFactory getRepairFactory() {
        return repairFactory;
    }

    public void setRepairFactory(IRepairFactory repairFactory) {
        this.repairFactory = repairFactory;
    }
}
