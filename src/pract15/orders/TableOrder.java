package pract15.orders;

import pract15.Customer;
import pract15.interfaces.Item;
import pract15.interfaces.Order;
import pract15.menu.MenuItem;

public class TableOrder implements Order {
    private final int DEFAULT_SIZE_OF_ARRAY = 10;
    private int size;
    private MenuItem[] items;

    public TableOrder() {
        this.items = new MenuItem[DEFAULT_SIZE_OF_ARRAY];
        this.size = 0;
    }

    public TableOrder(int arraySize)
    {
        this.items = new MenuItem[arraySize];
        this.size = 0;
    }

    public boolean add(MenuItem item) {
        if (size < items.length) {
            items[size] = item;
            size++;
            return true;
        }
        return false;
    }

    public String[] itemsNames() {
        if (size > 0)
        {
            String[] names = new String[size];
            int i = 0;
            while (i < size) {
                names[i] = this.items[i].getName();
                i++;
            }
            return names;
        }
        else
            return null;
    }

    public int itemsQuantity() {
        return this.size;
    }
    public int itemQuantity(String itemName) {
        int countItem = 0;
        int i = 0;

        while (i < size) {
            if (this.items[i].getName().equals(itemName))
                countItem++;
            i++;
        }
        return countItem;
    }
    public int itemQuantity(MenuItem item) {
        int countItem = 0;
        int i = 0;

        while (i < size)
        {
            if (this.items[i] == item)
                countItem++;
            i++;
        }
        return countItem;
    }

    public MenuItem[] getItems() { return this.items; }
    public boolean remove(String itemName) {
        MenuItem[] new_items = new MenuItem[this.items.length];
        int i = 0;
        int k = 0;

        if (itemQuantity(itemName) != 0)
        {
            while (i < size) {
                if (!this.items[k].getName().equals(itemName)) {
                    new_items[i] = this.items[k];
                    i++;
                }
                k++;
            }
            this.items = new_items;
            return true;
        }
        else
            return false;
    }
    public boolean remove(MenuItem item) {
        MenuItem[] new_items = new MenuItem[this.items.length];
        int i = 0;
        int k = 0;

        if (itemQuantity(item) != 0)
        {
            while (i < size) {
                if (this.items[k] == item) {
                    new_items[i] = this.items[k];
                    i++;
                }
                k++;
            }
            this.items = new_items;
            return true;
        }
        else
            return false;
    }

    public int removeAll(String itemName) { return 0; }
    public int removeAll(MenuItem item) { return 0; }
    public MenuItem[] sortedItemsByCostDesc() { return new MenuItem[0]; }
    public int costTotal() { return 0; }
    public Customer getCustomer() { return null; }
    public void setCustomer(Customer customer) { }
}
