package com.demo.Iterator;

import java.util.Iterator;

public class Waitress {
    private Menu pancakeMenu;
    private Menu dinerMenu;

    public Waitress(Menu pancakeMenu, Menu dinerMenu) {
        this.pancakeMenu = pancakeMenu;
        this.dinerMenu = dinerMenu;
    }

    public void printMenu(){
        Iterator pancakeIterator = pancakeMenu.createIterator();
        Iterator dinerIterator = dinerMenu.createIterator();
        printMenu(pancakeIterator);
        printMenu(dinerIterator);
    }

    private void printMenu(Iterator iterator){
        while (iterator.hasNext()){
            MenuItem item = (MenuItem) iterator.next();
            System.out.println("name:" + item.getName());
            System.out.println("desc:" + item.getDesc());
            System.out.println("vegetarian:" + item.isVegetarian());
            System.out.println("price:" + item.getPrice());
        }
    }
}
