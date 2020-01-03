package com.demo.Iterator;

import java.util.Iterator;

public class DinerMenu implements Menu{
    private static final int MAX_ITEMS = 6;
    private int number = 0;
    MenuItem[] menuItems;

    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];
        addItem("1111", "11111", false, 1.00);
        addItem("2222", "2222", false, 2.00);
        addItem("3333", "3333", false, 3.00);
        addItem("4444", "4444", true, 4.00);
    }


    private void addItem(String name, String desc, boolean vegetarian, double price){
        MenuItem menuItem = new MenuItem(name, desc, vegetarian, price);
        if(number >= MAX_ITEMS){
            System.out.println("out of range");
        }else{
            menuItems[number] = menuItem;
            number++;
        }
    }
    private MenuItem[] getMenuItems(){
        return this.menuItems;
    }

    @Override
    public Iterator createIterator(){
        return new DinerMenuIImpl(menuItems);
    }
}
