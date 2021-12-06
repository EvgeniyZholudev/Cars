import cars.AbstractCar;
import cars.FlyableCar;

import java.util.ArrayList;
import java.util.List;

public class Storage {

    private int wheel;
    private int door;
    private int wing;
    private List<AbstractCar> cars;
    private RepairFactory repairFactory;

    public Storage(int wheel, int door, int wing) {
        this.wheel = wheel;
        this.door = door;
        this.wing = wing;
        this.cars = new ArrayList<>();
    }

    public void fixCar(){
        this.repairFactory.fix(this.cars.get(0), wheel, door);
    }

    public void fixFlyableCar(){
        for(AbstractCar car: cars) {
            if(car instanceof FlyableCar) {
                this.repairFactory.fix((FlyableCar) car, wheel, door, wing);
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

    public List<AbstractCar> getCars() {
        return cars;
    }

    public void setCars(List<AbstractCar> cars) {
        this.cars = cars;
    }

    public RepairFactory getRepairFactory() {
        return repairFactory;
    }

    public void setRepairFactory(RepairFactory repairFactory) {
        this.repairFactory = repairFactory;
    }
}
