package cars;

public abstract class AbstractDrivableCar extends AbstractCar implements IDrivable {

    private int wheel;

    public AbstractDrivableCar(int door, int wheel) {
        super(door);
        this.wheel = wheel;
    }

    public int getWheel() {
        return wheel;
    }

    public void setWheel(int wheel) {
        this.wheel = wheel;
    }
}
