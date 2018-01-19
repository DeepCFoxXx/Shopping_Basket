package basket;

import items.Item;

import java.util.ArrayList;
import java.util.List;


public class Basket {

    private ArrayList<Item> items;
    private List<String> checkout;

    public Basket() {
        items = new ArrayList();
        checkout = new ArrayList<>();
    }

    public int getCount() {
        return this.items.size();
    }

    public void addItem(Item item) {
        this.items.add(item);
    }

    public void removeItem(Item item) {
        this.items.remove(item);
    }

    public void clearBasket(Item item) {
        this.items.clear();
    }

    public double getTotalValue() {

        double total = 0;

            for(Item item: items) {

                if (item.equals("Chicken")) {
                    total += 10.0;
                } else if (item.equals("Curry Paste")) {
                    total += 1.80;
                } else if (item.equals("Naan Bread")) {
                    total += 1.75;
                } else if (item.equals("Non Brand German Lilt")) {
                    total += 0.65;
                } else if (item.equals("Pineapple")) {
                    total += 0.90;
                } else if (item.equals("Rice Cakes")) {
                    total += 1.30;
                } else if (item.equals("Rice")) {
                    total += 1.00;
                } else if (item.equals("Tuna")) {
                    total += 2.80;
                }
            }

            return total;
    }
}
