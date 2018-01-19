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
    public void canGetTotalValue() {
        basket.addItem(chicken);
        basket.addItem(curryPaste);
        basket.addItem(naanBread);
        basket.addItem(nonBrandGermanLilt);
        basket.addItem(pineapple);
        basket.addItem(riceCakes);
        basket.addItem(rice);
        basket.addItem(tuna);
        assertEquals(10.0, basket.getTotalValue());
    }

}
