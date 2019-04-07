import Enums.InstrumentType;
import Enums.Material;
import Instruments.Guitar;
import SellableItems.DrumSticks;
import Shop.Shop;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Guitar guitar;
    DrumSticks drumsticks;
    Shop shop;

    @Before
    public void before(){
        guitar = new Guitar("Acoustic guitar", 86.00, 119.99, InstrumentType.GUITAR, Material.WOOD);
        drumsticks = new DrumSticks("Normal drumsticks", 3.70, 5.20);
        shop = new Shop();
    }

    @Test
    public void guitarHasStrings(){
        assertEquals(6, guitar.getNumberOfStrings());
    }

    @Test
    public void canGetMarkup(){
        assertEquals(1.50, drumsticks.calculateMarkup(), 0.01);
    }

    @Test
    public void canAddItemsToStock(){
        shop.addItemToStock(guitar);
        shop.addItemToStock(drumsticks);
        assertEquals(2, shop.getStock().size());
    }

    @Test
    public void canRemoveFromStock(){
        shop.addItemToStock(guitar);
        shop.removeItemFromStock(guitar);
        assertEquals(0, shop.getStock().size());
    }

    @Test
    public void canCalculatePotentialProfit(){
        shop.addItemToStock(guitar);
        shop.addItemToStock(drumsticks);
        assertEquals(35.49, shop.calculatePotentialProfit(), 0.001);
    }
}
