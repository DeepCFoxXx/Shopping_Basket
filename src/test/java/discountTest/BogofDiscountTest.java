package discountTest;

import basket.Item;
import discount.BogofDiscount;
import discount.Discount;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;

public class BogofDiscountTest {

    @Test public void zeroGivenIfNoBogof() {
        Discount bogof = new BogofDiscount();
        ArrayList<Item> items = new ArrayList<Item>();
        assertEquals(0.0, bogof.totalDiscount(items, 0.0), 0.001);
    }

    @Test
    public void shouldGiveSavingIfTwoBogofItems(){
        BogofDiscount bogof = new BogofDiscount();
        bogof.addDiscountItem("Pasta");
        ArrayList<Item> items = new ArrayList<Item>();
        Item pasta1 = new Item("Pasta", 1.50);
        Item pasta2 = new Item("Pasta", 1.50);
        items.add( pasta1 );
        items.add( pasta2 );
        assertEquals( 3.00, bogof.totalDiscount( items, 0.0  ), 0.001 );
    }

}
