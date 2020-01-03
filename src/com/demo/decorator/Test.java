package com.demo.decorator;

public class Test {
    public static void main(String[] args){
        Component component = new ConcreteComponent();
        component = new ConcreteDecorator(component);
        component = new ConcreteDecorator2(component);
        component.operate();
    }
}
