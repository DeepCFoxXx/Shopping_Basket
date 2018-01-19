package basket;

import items.Item;

import java.util.ArrayList;

public class Basket {

    private ArrayList<Item> items;

    public Basket() {
        items = new ArrayList();
    }

    public int getCount() {
        return this.items.size();
    }
}
