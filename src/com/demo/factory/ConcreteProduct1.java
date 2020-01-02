package com.demo.factory;

public class ConcreteProduct1 implements Product {
    @Override
    public void getColor() {
        System.out.println("ConcreteProduct1.getColor white");
    }

    @Override
    public void talk() {
        System.out.println("ConcreteProduct1.talk...");
    }
}
