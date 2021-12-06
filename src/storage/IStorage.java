package storage;

import cars.IMachine;
import factory.IRepairFactory;

import java.util.List;

public interface IStorage {

    void fixCar();

    void fixFlyableCar();

    int getWheel();

    void setWheel(int wheel);

    int getDoor();

    void setDoor(int door);

    List<IMachine> getCars();

    void setCars(List<IMachine> cars);

    IRepairFactory getRepairFactory();

    void setRepairFactory(IRepairFactory repairFactory);

}
