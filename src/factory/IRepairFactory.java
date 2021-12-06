package factory;

import cars.IFlyableCar;
import cars.IMachine;

public interface IRepairFactory {

    void fix(IMachine car, int wheel, int door);

    void fix(IFlyableCar car, int wheel, int door, int wing);
}
