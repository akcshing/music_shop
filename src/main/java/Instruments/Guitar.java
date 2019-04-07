package Instruments;

import Enums.InstrumentType;
import Enums.Material;

public class Guitar extends Instrument{
    private int numberOfStrings;

    public Guitar(String description, double buyPrice, double sellPrice, InstrumentType type, Material material){
        super(description, buyPrice, sellPrice, InstrumentType.GUITAR, Material.WOOD);
        this.numberOfStrings = 6;
    }

    public String play(){
        return "guitar sounds";
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }
}
