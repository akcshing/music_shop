package Instruments;

import Enums.InstrumentType;
import Enums.Material;

public class Trumpet extends Instrument{
    private int numberOfValves;

    public Trumpet(String description, double buyPrice, double sellPrice, InstrumentType type, Material material){
        super(description, buyPrice, sellPrice, InstrumentType.BRASS, Material.BRASS);
        this.numberOfValves = 3;
    }

    public String play(){
        return "trumpet sounds";
    }

    public int getNumberOfValves() {
        return numberOfValves;
    }
}
