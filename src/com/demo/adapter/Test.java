package com.demo.adapter;

public class Test {
    public static void main(String[] args){
        MallardDuck duck = new MallardDuck();
        WildTurkey wildTurkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(wildTurkey);
        System.out.println("turkey says....");
        wildTurkey.gobble();
        wildTurkey.fly();

        System.out.println("duck says....");
        testDuck(duck);
        System.out.println("turkey adapter says...");
        testDuck(turkeyAdapter);
    }

    static void testDuck(Duck duck){
        duck.quack();
        duck.fly();
    }
}
