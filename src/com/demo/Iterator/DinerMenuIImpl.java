package com.demo.Iterator;

import java.util.Iterator;

public class DinerMenuIImpl implements Iterator {
    private MenuItem[] menuItems;
    private int position = 0;
    public DinerMenuIImpl(MenuItem[] menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
       if(position >= menuItems.length || menuItems[position] == null){
            return false;
       }else {
            return true;
       }
    }

    @Override
    public Object next() {
        MenuItem menuItem = menuItems[position];
        position++;
        return menuItem;
    }
}
