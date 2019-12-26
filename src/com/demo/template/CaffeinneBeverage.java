package com.demo.template;

public abstract class CaffeinneBeverage {
    final void prepareRecip(){
        boilWater();
        brew();
        pourInCup();
        if(wantsCondiments()){
            addCondiments();
        }
    }

    abstract void brew();
    abstract void addCondiments();

    private void boilWater(){
        System.out.println("boiling water");
    }

    private void pourInCup(){
        System.out.println("pouring in cup");
    }

    protected boolean wantsCondiments(){
        return true;
    }
}

