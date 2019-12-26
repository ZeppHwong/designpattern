package com.demo.Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class PancakeMenu implements Menu{
    private ArrayList<MenuItem>  menuItems;

    public PancakeMenu() {
        this.menuItems = new ArrayList<>();

        addItem("aaaa", "aaaaa",false, 1.00);
        addItem("bbbb", "bbbbb",false, 1.20);
        addItem("cccc", "ccccc",true, 1.00);
        addItem("dddd", "ddddd",true, 2.00);

    }


    private void addItem(String name, String desc, boolean vegetarian, double price){
        MenuItem item = new MenuItem(name, desc, vegetarian, price);
        menuItems.add(item);
    }

    private ArrayList<MenuItem> getMenuItems(){
        return menuItems;
    }

    public Iterator createIterator(){
        return new PanCakeImpl(menuItems);
    }
}
