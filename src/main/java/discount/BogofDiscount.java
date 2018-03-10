package discount;

import basket.Item;

import java.util.ArrayList;

public class BogofDiscount implements Discount{

    private ArrayList<String> bogofItemNames = new ArrayList<String>();

    public void addDiscountItem( String itemName ) {
        bogofItemNames.add(itemName);
    }

    private int numberOfItems(ArrayList<Item> items, String name) {
        int count = 0;
        for ( Item item : items ){
            if ( item.getName() == name) {
                count++;
            }
        }
        return count;
    }

    private double valueOfItem(ArrayList<Item> items, String name) {
        for (Item item : items) {
            if (item.getName() == name) {
                return item.getPrice();
            }
        }
        return 0.0;
    }

    private double discountForItemName(ArrayList<Item>items, String name) {
        double numberOfItems = this.numberOfItems(items, name);
        return Math.floor(numberOfItems/2)* this.valueOfItem(items, name);
    }

}
