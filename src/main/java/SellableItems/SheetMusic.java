package SellableItems;

import Interfaces.ISell;

public class SheetMusic extends SellableItem {
    private String musicPiece;
    private int numberOfPages;

    public SheetMusic(String description, double buyPrice, double sellPrice, String musicPiece, int numberOfPages){
        super(description, buyPrice, sellPrice);
        this.musicPiece = musicPiece;
        this.numberOfPages = numberOfPages;
    }

    public String getMusicPiece() {
        return musicPiece;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }
}
