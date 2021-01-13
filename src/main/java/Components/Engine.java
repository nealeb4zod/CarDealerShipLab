package Components;

import Enums.EngineType;

public class Engine {

    private double size;
    private EngineType type;

    public Engine(double size, EngineType type) {
        this.size = size;
        this.type = type;
    }


    public double getSize() {
        return size;
    }

    public EngineType getType() {
        return type;
    }
}
