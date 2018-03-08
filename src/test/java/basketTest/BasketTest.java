package basketTest;

import basket.Basket;
import basket.Item;
import discount.Discount;
import discount.SimpleDiscount;
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
        assertEquals(14.50, basket.total(),0.01);
    }

    @Test
    public void canUseDiscounts() {
        Basket myBasket = new Basket();
        Item Chocolate = new Item("Chocolate",2.00);
        myBasket.addItem(Chocolate);
        Discount poundOff = new SimpleDiscount(1.00);
        myBasket.applyDiscount(poundOff);
        assertEquals(1.00, myBasket.total(), 0.0001);
    }

}
