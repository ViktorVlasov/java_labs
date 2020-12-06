package lab16.cafe.interfaces;

import lab16.cafe.menu.MenuItem;


public interface OrdersManager {

    int itemsQuantity(String itemName);
    int itemsQuantity(MenuItem item);
    Order[] getOrders();
    int ordersCostSummary();
    int ordersQuantity();
}
