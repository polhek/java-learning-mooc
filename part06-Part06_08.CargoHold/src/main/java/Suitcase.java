
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author zigagroselj
 */
public class Suitcase {

    private int maxWeight;
    private ArrayList<Item> items;

    public Suitcase(int maxWeight) {
        this.maxWeight = maxWeight;
        this.items = new ArrayList<Item>();
    }

    public int totalWeight() {
        int weight = 0;

        for (Item item : items) {
            weight += item.getWeight();
        }
        return weight;
    }

    public void addItem(Item item) {
        if (totalWeight() + item.getWeight() <= this.maxWeight) {
            this.items.add(item);
        } else {
            return;
        }
    }

    public void printItems() {
        for (Item item : this.items) {
            System.out.println(item);
        }
    }

    public Item heaviestItem() {
        if (this.items.isEmpty()) {
            return null;
        }
        Item heaviestItem = this.items.get(0);

        for (Item item : items) {
            if (heaviestItem.getWeight() < item.getWeight()) {
                heaviestItem = item;
            }
        }
        return heaviestItem;
    }

    @Override
    public String toString() {
        String weightOutput = " (" + totalWeight() + "kg)";
        String itemOutput = "";

        if (this.items.isEmpty()) {
            itemOutput = "no items";
        } else if (this.items.size() == 1) {
            itemOutput = "1 item";
        } else {
            itemOutput = this.items.size() + " items";
        }
        return itemOutput + weightOutput;
    }
}
