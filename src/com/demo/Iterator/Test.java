package com.demo.Iterator;

public class Test {
    public static void main(String[] args){
        Menu pancakeMenu = new PancakeMenu();
        Menu dinerMenu = new DinerMenu();
        Menu cafeMenu = new CafeMenu();
        Waitress waitress = new Waitress(pancakeMenu, dinerMenu, cafeMenu);
        waitress.printMenu();
    }
}
