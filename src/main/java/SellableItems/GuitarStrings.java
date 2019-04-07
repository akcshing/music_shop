package SellableItems;

import Instruments.Guitar;
import Interfaces.ISell;

public class GuitarStrings extends SellableItem {

    private String stringType;
    private int numberOfStrings;

    public GuitarStrings(String description, double buyPrice, double sellPrice, String stringType, int numberOfStrings){
        super(description, buyPrice, sellPrice);
        this.stringType = stringType;
        this.numberOfStrings = numberOfStrings;
    }

    public String getStringType() {
        return stringType;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }
}
