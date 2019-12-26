package com.demo.Iterator;

import java.util.HashMap;
import java.util.Iterator;

public class CafeMenu implements Menu{
    private HashMap<String,Object> menuItems = new HashMap<>();


    public CafeMenu() {
        addItem("cafe1", "11111", false, 1.00);
        addItem("cafe2", "2222", false, 2.00);
        addItem("cafe3", "3333", false, 3.00);
        addItem("cafe4", "4444", true, 4.00);
    }

    private void addItem(String name, String desc, boolean vegetarian, double price){
        MenuItem menuItem = new MenuItem(name, desc, vegetarian, price);
        menuItems.put(menuItem.getName(), menuItem);
    }

    @Override
    public Iterator createIterator() {
        return menuItems.values().iterator();
    }
}
