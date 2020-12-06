package pract15.menu;

import pract15.interfaces.Item;

public class MenuItem implements Item {
    protected int cost;
    protected String name;
    protected String description;

    public int getCost() {
        return cost;
    }
    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }
}
