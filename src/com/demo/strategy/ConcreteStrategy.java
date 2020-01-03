package com.demo.strategy;

public class ConcreteStrategy implements IStrategy {
    @Override
    public void dosomething() {
        System.out.println("ConcreteStrategy.dosomething");
    }
}
