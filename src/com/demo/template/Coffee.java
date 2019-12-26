package com.demo.template;

public class Coffee extends CaffeinneBeverage{

    @Override
    void brew() {
        System.out.println("dripping coffee through filter");
    }

    @Override
    void addCondiments() {
        System.out.println("adding sugar and milk");
    }
}
