package factory;

import cars.IFlyableCar;
import cars.IMachine;

public class RepairFactory implements IRepairFactory {

    public void fix(IMachine car, int wheel, int door) {

    }

    public void fix(IFlyableCar car, int wheel, int door, int wing) {

    }

}
