package cars;

import cars.engine.IEngine;

public interface IMachine {

    int getDoor();

    void setDoor(int door);

    IEngine getEngine();

    void setEngine(IEngine engine);

}
