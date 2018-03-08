package basketTest;

import basket.Basket;
import basket.Item;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class BasketTest {

    Basket basket;
    Item item;

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
        item = new Item("Chicken", 10.0);
        basket.addItem(item);
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
        basket.addItem(new Item("Chicken", 10.0));
        basket.addItem(new Item("Curry Paste", 1.50));
        basket.addItem(new Item("Naan Bread", 1.75));
        basket.addItem(new Item("Rice", 1.25));
        assertEquals(14.50, basket.getTotalValue(),0.01);
    }

}
