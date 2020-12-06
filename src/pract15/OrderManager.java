package pract15;

/*
import pract15.exceptions.OrderAlreadyAddedException;
import pract15.interfaces.Item;
import pract15.interfaces.Order;
import java.util.HashMap;


public final class OrderManager {

    private HashMap<String, Order> addressOrder;

    public void add(String address, Order order) throws OrderAlreadyAddedException {
        if (!addressOrder.containsKey(address))
            addressOrder.put(address, order);
        else {
            throw new OrderAlreadyAddedException(order);
        }
    }

    public int allOrdersSum() {
        int result = 0;

        for (var order : addressOrder.values())
            result += order.getOrderPrice();
        return result;
    }

    public int itemsCount(String itemName) {
        int result = 0;

        for (var order : addressOrder.values())
            result += order.countOf(itemName);
        return result;
    }

    public Order getOrder(String address) {
        return addressOrder.get(address);
    }
    public Order removeOrder(String address) {
        return addressOrder.remove(address);
    }
    public boolean addToOrder(String address, Item newItem) {
        return addressOrder.get(address).add(newItem);
    }
    public Order[] getAllOrders() {
        return addressOrder.values().toArray(new Order[0]);
    }
}
*/