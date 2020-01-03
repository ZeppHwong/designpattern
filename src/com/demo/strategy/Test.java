package com.demo.strategy;

public class Test {
    public static void main(String[] args){
        IStrategy strategy = new ConcreteStrategy();
        IStrategy strategy2 = new ConcreteStrategy2();
        Context context = new Context(strategy2);
        context.doAnything();
    }
}
