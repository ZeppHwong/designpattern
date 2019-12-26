package com.demo.template;

public class Tea extends CaffeinneBeverage{
    @Override
    void brew() {
        System.out.println("steeping the tea...");
    }

    @Override
    void addCondiments() {
        System.out.println("adding lemon..");
    }
}
