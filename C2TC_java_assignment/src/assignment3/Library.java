package assignment3;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Item> items;

    public Library() {
        items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void showAllItems() {
        for (Item item : items) {
            item.displayInfo();
            System.out.println("-------------------");
        }
    }
}