package Instruments;

import Enums.InstrumentType;
import Enums.Material;

public class Flute extends Instrument{
    private int numberOfComponents;

    public Flute(String description, double buyPrice, double sellPrice, InstrumentType type, Material material){
        super(description, buyPrice, sellPrice, InstrumentType.WOODWIND, Material.METAL);
        this.numberOfComponents = 3;
    }

    public String play(){
        return "flute sounds";
    }

    public int getNumberOfComponents() {
        return numberOfComponents;
    }
}
