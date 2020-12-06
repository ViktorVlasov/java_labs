package pract15;

/*
import pract15.interfaces.IItemSelector;
import pract15.interfaces.Item;
import pract15.interfaces.Order;
import pract15.utils.ItemsSorter;
import pract15.utils.MyArrayList;
import pract15.utils.CycledLinkedList;


public class InternetOrder extends CycledLinkedList<Item> implements Order {

    private IItemSelector<Item> getSelectorByName(String name) {
        return (item) -> item.getName().equals(name);
    }

    public Item[] select(IItemSelector<Item> selector) {
        var result = new MyArrayList<Item>();

        for (int i = 0; i < size; ++i) {
            if (selector.selectIt(next()))
                result.add(current.getData());
        }
        return (Item[])result.toArray();
    }

    public int countOf(IItemSelector<Item> selector) {
        int count = 0;

        for (int i = 0; i < size; ++i)
            if (selector.selectIt(next()))
                ++count;
        return count;
    }

    public int getOrderPrice() {
        int result = 0;

        prev();
        for (int i = 0; i < size; ++i)
            result += next().getCost();
        return result;
    }

    public String[] allNames() {
        Item[] items = toArray();
        MyArrayList<String> result = new MyArrayList<>(items.length);

        for (Item item : items)
            if (!result.contains(item.getName()))
                result.add(item.getName());
        return (String[])result.toArray();
    }

    public Item[] toSortedArray() {
        Item[] items = toArray();
        ItemsSorter.sort(items);
        return items;
    }

    public boolean removeByName(String name) {
        return remove(getSelectorByName(name));
    }
    public int removeAllByName(String name) {
        return removeAll(getSelectorByName(name));
    }
    public int getCount() {
        return size;
    }
    public int countOf(String name) {
        return countOf(getSelectorByName(name));
    }
}
*/