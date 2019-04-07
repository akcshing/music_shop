package Instruments;

import Enums.InstrumentType;
import Enums.Material;

public class Cello extends Instrument{
    private int numberOfStrings;

    public Cello(String description, double buyPrice, double sellPrice, InstrumentType type, Material material){
        super(description, buyPrice, sellPrice, InstrumentType.STRING, Material.WOOD);
        this.numberOfStrings = 4;
    }

    public String play(){
        return "cello sounds";
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }
}
