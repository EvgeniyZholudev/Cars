import cars.IFlyableCar;
import cars.IMachine;
import cars.impl.AbstractCar;
import cars.impl.Car;
import cars.impl.FlyableCar;
import factory.IRepairFactory;
import factory.RepairFactory;
import storage.IStorage;
import storage.Storage;

import java.util.ArrayList;
import java.util.List;

public class Training {

    public static void main(String[] args) {
        IMachine car = new Car(2, 2);
        IFlyableCar flyableCar = new FlyableCar(2, 2, 2);
        List<IMachine> cars = new ArrayList<>();
        cars.add(car);
        cars.add(flyableCar);

        IRepairFactory factory = new RepairFactory();
        IStorage storage = new Storage(10, 10, 10);
        storage.setRepairFactory(factory);
        storage.setCars(cars);
        storage.fixFlyableCar();
    }

    public static int findWeight(int needWeight){
        int[] weight = {1,5,12,48,99,115,118,166,180};
        int firstIndex = 0;
        int lastIndex = weight.length - 1;
        while (lastIndex > firstIndex) {
            int middleIndex = (lastIndex + firstIndex) / 2;

            if(weight[middleIndex] == needWeight){
                return weight[middleIndex];
            }

            if(needWeight > weight[middleIndex]){
                firstIndex = middleIndex;
            }

            if(needWeight < weight[middleIndex]){
                lastIndex = middleIndex;
            }
        }
        return -1;
    }

}
