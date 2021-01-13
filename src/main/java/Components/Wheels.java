package Components;

import Enums.WheelType;



public class Wheels {

    private int numberOf;
    private WheelType type;

    public Wheels(int numberOf, WheelType type) {
        this.numberOf = numberOf;
        this.type = type;

    }

    public int getNumberOf() {
        return numberOf;
    }

    public WheelType getType() {
        return type;
    }
}
