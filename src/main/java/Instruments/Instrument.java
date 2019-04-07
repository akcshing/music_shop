package Instruments;

import Enums.InstrumentType;
import Enums.Material;
import Interfaces.IPlay;
import SellableItems.SellableItem;

public abstract class Instrument extends SellableItem implements IPlay {
    private InstrumentType type;
    private Material material;

    public Instrument(String description, double buyPrice, double sellPrice, InstrumentType type, Material material){
        super(description, buyPrice, sellPrice);
        this.type = type;
        this.material = material;
    }

    public InstrumentType getType() {
        return type;
    }

    public void setType(InstrumentType type) {
        this.type = type;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }
}
