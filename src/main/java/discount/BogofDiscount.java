package discount;

import basket.Item;

import java.util.ArrayList;

public class BogofDiscount implements Discount{

    private ArrayList<String> bogofItemNames = new ArrayList<String>();

    public void addDiscountItem( String itemName ) {
        bogofItemNames.add(itemName);
    }

    private int numberOfItems( ArrayList<Item> items, String name ) {
        int count = 0;
        for ( Item item : items ){
            if ( item.getName() == name) {
                count++;
            }
        }
        return count;
    }

}
