package com.demo.Iterator;

import java.util.Iterator;

public class Waitress {
    private Menu pancakeMenu;
    private Menu dinerMenu;
    private Menu cafeMenu;

    public Waitress(Menu pancakeMenu, Menu dinerMenu, Menu cafeMenu) {
        this.pancakeMenu = pancakeMenu;
        this.dinerMenu = dinerMenu;
        this.cafeMenu = cafeMenu;
    }

    public void printMenu(){
        Iterator pancakeIterator = pancakeMenu.createIterator();
        Iterator dinerIterator = dinerMenu.createIterator();
        Iterator cafeIterator = cafeMenu.createIterator();
        printMenu(pancakeIterator);
        printMenu(dinerIterator);
        printMenu(cafeIterator);
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
