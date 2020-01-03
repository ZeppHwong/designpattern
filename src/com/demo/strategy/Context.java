package com.demo.strategy;

public class Context {
    private IStrategy iStrategy;

    public Context(IStrategy iStrategy) {
        this.iStrategy = iStrategy;
    }

    public void doAnything(){
        this.iStrategy.dosomething();
    }
}
