package basketTest;

import basket.Basket;
import items.Item;
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

}
