package pract15;
/*
import pract15.interfaces.Item;
import pract15.interfaces.Order;
import pract15.utils.ItemsSorter;
import pract15.utils.MyArrayList;

public class RestaurantOrder implements Order {

    private MyArrayList<Item> items;

    public boolean add(Item item) {
        return items.add(item);
    }

    public boolean removeByName(String name) {
        for (int i = items.size() - 1; i >= 0; --i)
            if (items.at(i).getName().equals(name)) {
                items.remove(i);
                return true;
            }
        return false;
    }

    public int removeAllByName(String name) {
        int count = 0;
        for (var item : items)
            if (item.getName().equals(name))
                ++count;

        items.removeIf(item -> item.getName().equals(name));
        return count;
    }

    public int getOrderPrice() {
        int result = 0;

        for (var item : items)
            result += item.getCost();
        return result;
    }

    public int countOf(String name) {
        int count = 0;

        for (Item item : items)
            if (item.getName().equals(name))
                ++count;
        return count;
    }

    public String[] allNames() {
        MyArrayList<String> names = new MyArrayList<>();

        for (Item item : items)
            if (!names.contains(item.getName()))
                names.add(item.getName());
        return (String[])names.toArray();
    }

    public Item[] toSortedArray() {
        Item[] result = (Item[])items.toArray();
        ItemsSorter.sort(result);
        return result;
    }

    public int getCount() {
        return items.size();
    }
    public Item[] toArray() {
        return (Item[]) items.toArray();
    }
    public boolean remove(Item item) {
        return items.remove(item);
    }
}
*/