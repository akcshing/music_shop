package Shop;

import Interfaces.ISell;

import java.util.ArrayList;

public class Shop {

    private ArrayList<ISell> stock;

    public Shop(){
        this.stock = new ArrayList<>();
    }

    public ArrayList<ISell> getStock() {
        return this.stock;
    }

    public void addItemToStock(ISell item){
        this.stock.add(item);
    }

    public void removeItemFromStock(ISell item){
        this.stock.remove(item);
    }

    public double calculatePotentialProfit(){
        double profit = 0;
        for(ISell item : this.stock){
            profit += item.calculateMarkup();
        }
        return profit;
    }
}
