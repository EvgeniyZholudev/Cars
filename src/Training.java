import cars.AbstractCar;
import cars.Car;
import cars.FlyableCar;

import java.util.ArrayList;
import java.util.List;

public class Training {

    public static void main(String[] args) {
        AbstractCar car = new Car(2, 2);
        AbstractCar flyableCar = new FlyableCar(2, 2, 2);
        List<AbstractCar> cars = new ArrayList<>();
        cars.add(car);
        cars.add(flyableCar);

        RepairFactory factory = new RepairFactory();
        Storage storage = new Storage(10, 10, 10);
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
