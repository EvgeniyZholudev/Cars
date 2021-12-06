package cars;

public class FlyableCar extends AbstractFlyableCar implements IDrivable {

    private int wheel;

    public FlyableCar(int door, int wing, int wheel) {
        super(door, wing);
        this.wheel = wheel;
    }

    public int getWheel() {
        return wheel;
    }

    public void setWheel(int wheel) {
        this.wheel = wheel;
    }
}
