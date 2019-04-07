package Instruments;

import Enums.InstrumentType;
import Enums.Material;

public class Piano extends Instrument{
    private int numberOfKeys;

    public Piano(String description, double buyPrice, double sellPrice, InstrumentType type, Material material){
        super(description, buyPrice, sellPrice, InstrumentType.PIANO, Material.WOOD);
        this.numberOfKeys = 88;
    }

    public String play(){
        return "piano sounds";
    }

    public int getNumberOfKeys() {
        return numberOfKeys;
    }
}
