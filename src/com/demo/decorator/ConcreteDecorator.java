package com.demo.decorator;

public class ConcreteDecorator extends Decorator {
    /**
     * 定义被修饰者
     *
     * @param component
     */
    public ConcreteDecorator(Component component) {
        super(component);
    }

    /**
     * 定义自己的修饰方法
     */
    private void method1(){
        System.out.println("ConcreteDecorator.method1");
    }

    /**
     * 重写父类的方法
     */
    @Override
    public void operate() {
        this.method1();
        super.operate();
    }
}
