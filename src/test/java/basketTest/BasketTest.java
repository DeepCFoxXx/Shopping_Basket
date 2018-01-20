package basketTest;

import basket.Basket;
import items.*;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class BasketTest {

    Basket basket;
    Item item;
    Chicken chicken;
    CurryPaste curryPaste;
    NaanBread naanBread;
    NonBrandGermanLilt nonBrandGermanLilt;
    Pineapple pineapple;
    RiceCakes riceCakes;
    Rice rice;
    Tuna tuna;


    @Before
    public void before() {
       basket = new Basket();
    }

    @Test
    public void basketStartsEmpty() {
        assertEquals(0, basket.getCount());
    }

    @Test
    public void canAddToBasket() {
        basket.addItem(item);
        assertEquals(1, basket.getCount());
    }


    @Test
    public void canRemoveFromBasket() {
        basket.addItem(item);
        basket.removeItem(item);
        assertEquals(0, basket.getCount());
    }


    @Test
    public void canRemoveObject() {
        chicken = new Chicken("Chicken", 10.0);
        basket.addItem(chicken);
        assertEquals(1, basket.getCount());
    }

    @Test
    public void canClearBasket() {
        basket.addItem(item);
        basket.clearBasket(item);
        assertEquals(0, basket.getCount());
    }

    @Test
    public void canAddAllItems() {
        basket.addItem(chicken);
        basket.addItem(curryPaste);
        basket.addItem(naanBread);
        basket.addItem(nonBrandGermanLilt);
        basket.addItem(pineapple);
        basket.addItem(riceCakes);
        basket.addItem(rice);
        basket.addItem(tuna);
        assertEquals(8, basket.getCount());
    }

    @Test
    public void canGetTotalValue() {
        basket.addName("Chicken");
        basket.addName("Curry Paste");
        basket.addName("Naan Bread");
        basket.addName("Non Brand German Lilt");
        basket.addName("Pineapple");
        basket.addName("Rice Cakes");
        basket.addName("rice");
        basket.addName("tuna");
        assertEquals(20.20, basket.getTotalValue(),0.01);
    }

}
