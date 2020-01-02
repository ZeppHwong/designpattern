package com.demo.factory;

public class ConcreteProduct2 implements Product {
    @Override
    public void getColor() {
        System.out.println("ConcreteProduct2.getColor black");
    }

    @Override
    public void talk() {
        System.out.println("ConcreteProduct2.talk...");
    }
}
