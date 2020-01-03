package com.demo.decorator;

public class ConcreteDecorator2 extends Decorator {
    /**
     * 定义被修饰者
     *
     * @param component
     */
    public ConcreteDecorator2(Component component) {
        super(component);
    }

    /**
     * 定义自己的修饰方法
     */
    private void method2(){
        System.out.println("ConcreteDecorator2.method2");;
    }

    /**
     * 重写父类的方法
     */
    @Override
    public void operate() {
        this.method2();
        super.operate();
    }
}
