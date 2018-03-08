package basket;


import discount.Discount;

import java.util.ArrayList;

public class Basket {

    private ArrayList<Item> items = new ArrayList<Item>();
    private ArrayList<Discount>  discounts = new ArrayList<Discount>();

    public Basket() {
        items = new ArrayList();
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

        for(Item item : items) {
            total += item.getPrice();
            }

            return total;
    }


}
