package discountTest;

import basket.Basket;
import basket.Item;
import discount.BogofDiscount;
import discount.PercentageDiscount;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class IntegrationTest {

    @Test public void shouldUseBogof() {
        Basket myBasket = new Basket();
        Item ham1 = new Item("Ham", 1.00);
        Item ham2 = new Item("Ham", 1.00);
        Item cheese1 = new Item("Cheese", 3.00);
        Item cheese2 = new Item("Cheese", 3.00);
        myBasket.addItem(ham1);
        myBasket.addItem(ham2);
        myBasket.addItem(cheese1);
        myBasket.addItem(cheese2);
        BogofDiscount bogof = new BogofDiscount();
        bogof.addDiscountItem("Ham");
        myBasket.applyDiscount(bogof);
        assertEquals(7.00, myBasket.total(), 0.01);

    }

    @Test public void shouldUseBogofAnd20PoundDiscount() {
        Basket myBasket = new Basket();
        Item ham1 = new Item("Ham", 1.00);
        Item ham2 = new Item("Ham", 1.00);
        Item cheese1 = new Item("Cheese", 3.00);
        Item cheese2 = new Item("Cheese", 3.00);
        Item rootBeer = new Item("Root Beer", 18.00);
        myBasket.addItem(ham1);
        myBasket.addItem(ham2);
        myBasket.addItem(cheese1);
        myBasket.addItem(cheese2);
        myBasket.addItem(rootBeer);
        BogofDiscount bogof = new BogofDiscount();
        PercentageDiscount tenPercentDiscount = new PercentageDiscount(0.1, 20);
        bogof.addDiscountItem("Ham");
        myBasket.applyDiscount(bogof);
        myBasket.applyDiscount(tenPercentDiscount);
        assertEquals(22.5, myBasket.total(), 0.001);

    }

}
