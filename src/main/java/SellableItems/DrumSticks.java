package SellableItems;

import Enums.Material;
import Interfaces.ISell;

public class DrumSticks extends SellableItem {

    private Material material;

    public DrumSticks(String description, double buyPrice, double sellPrice){
        super(description, buyPrice, sellPrice);
    }

    public Material getMaterial() {
        return material;
    }
}
