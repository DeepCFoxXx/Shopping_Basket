package discount;

import java.util.ArrayList;

import items.Item;

public interface IDiscount {

    double applyDiscount(ArrayList<Item> items, double total);

}
