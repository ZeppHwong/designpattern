package com.demo.Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class PanCakeImpl implements Iterator {
    private int position = 0;
    private ArrayList<MenuItem> menuItems;

    public PanCakeImpl(ArrayList<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        if(position >= menuItems.size() || menuItems.get(position) == null){
            return false;
        }else{
            return true;
        }
    }

    @Override
    public Object next() {
        MenuItem menuItem = menuItems.get(position);
        position ++;
        return menuItem;
    }
}
