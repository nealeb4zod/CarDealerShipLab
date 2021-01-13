package Components;

import Enums.UpholsteryType;

public class Seats {

    private int numberOf;
    private UpholsteryType type;

    public Seats(int numberOf, UpholsteryType type){
        this.numberOf = numberOf;
        this.type= type;
    }

    public int getNumberOf(){
        return this.numberOf;
    }

    public UpholsteryType getType(){
        return this.type;
    }
}
